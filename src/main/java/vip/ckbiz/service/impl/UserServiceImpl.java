package vip.ckbiz.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import vip.ckbiz.common.Const;
import vip.ckbiz.common.ServerResponse;
import vip.ckbiz.service.UserService;
import vip.ckbiz.util.MD5Utils;
import vip.ckbiz.vo.USERVO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserServiceImpl implements UserService {

    private SqlSession sqlSession;

    /**
     * 用户登陆
     * @param username
     * @param password
     * @return
     */
    public ServerResponse<USERVO> login(String username, String password) {
        int resultCount = sqlSession.selectOne("CKBIZ.USER.checkUsername", username);
        if (resultCount == 0) {
            return ServerResponse.createByErrorMessage("用户名不存在");
        }

        String md5password = MD5Utils.MD5EncodeUtf8(password);

        Map<String, Object> param = new HashMap<String, Object>();
        param.put("USERNAME", username);
        param.put("PASSWORD", md5password);
        USERVO uservo = sqlSession.selectOne("CKBIZ.USER.selectLogin", param);
        if (uservo == null) {
            return ServerResponse.createByErrorMessage("密码错误");
        }

        uservo.setPASSWORD(StringUtils.EMPTY);
        return ServerResponse.createBySuccess("登录成功", uservo);
    }

    /**
     * 用户注册
     * @param uservo
     * @return
     */
    public ServerResponse<String> register(USERVO uservo) {
        int resultCount = sqlSession.insert("CKBIZ.USER.register", uservo);
        if (resultCount == 0) {
            return ServerResponse.createByErrorMessage("会员注册失败，请稍后再试");
        }
        return ServerResponse.createBySuccessMessage("注册成功");

    }

    /**
     * 验证用户名和Email
     * @param str
     * @param type
     * @return
     */
    public ServerResponse<String> checkValid(String str, String type) {
        if (StringUtils.isNotBlank(type)) {
            //开始校验
            if (Const.USERNAME.equals(type)) {
                int resultCount = sqlSession.selectOne("CKBIZ.USER.checkUsername", str);
                if (resultCount > 0) {
                    return ServerResponse.createByErrorMessage("用户名已存在");
                }
            }
            if (Const.EMAIL.equals(type)) {
                int resultCount = sqlSession.selectOne("CKBIZ.USER.checkEmail", str);
                if (resultCount > 0) {
                    return ServerResponse.createByErrorMessage("Email已存在");
                }
            }
        } else {
            return ServerResponse.createByErrorMessage("参数错误");
        }
        return ServerResponse.createBySuccessMessage("校验成功");
    }

    public ServerResponse checkAdmin(USERVO uservo) {
        if (uservo != null && uservo.getROLE().equals(Const.Role.ROLE_ADMIN)) {
            return ServerResponse.createBySuccess();
        }
        return ServerResponse.createByError();
    }

    public SqlSession getSqlSession() {
        return sqlSession;
    }

    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }


}