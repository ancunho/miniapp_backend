package vip.ckbiz.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import vip.ckbiz.common.ServerResponse;
import vip.ckbiz.service.UserService;
import vip.ckbiz.vo.USERVO;

import java.util.List;

@Repository
public class UserServiceImpl implements UserService {

    private SqlSession sqlSession;

    public ServerResponse getAllUser() throws Exception {
        List<USERVO> lstUser = sqlSession.selectList("CKBIZ.USER.getAllUser");
        if (lstUser != null && lstUser.size() > 0) {
            return ServerResponse.createBySuccess(lstUser);
        }

        return ServerResponse.createByErrorMessage("用户不存在");

    }

    public SqlSession getSqlSession() {
        return sqlSession;
    }

    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }


}