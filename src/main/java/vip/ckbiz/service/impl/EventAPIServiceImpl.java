package vip.ckbiz.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;
import vip.ckbiz.common.ServerResponse;
import vip.ckbiz.service.EventAPIService;
import vip.ckbiz.vo.EVENT01VO;

import java.util.Collections;
import java.util.List;

/**
 * 微信API
 * Event活动接口
 */
@Repository
public class EventAPIServiceImpl implements EventAPIService {

    private SqlSession sqlSession;

    public ServerResponse<List<EVENT01VO>> selectAllEvent01() {
        List<EVENT01VO> selectAllEvent01 = sqlSession.selectList("CKBIZ.EVENTAPI.selectAllEvent01");
        if (CollectionUtils.isEmpty(selectAllEvent01)) {
            return ServerResponse.createByErrorMessage("未找到活动");
        }

        return ServerResponse.createBySuccess(selectAllEvent01);
    }

    public ServerResponse insertEvent01(EVENT01VO event01VO) {
        int resultCount = sqlSession.insert("CKBIZ.EVENTAPI.insertEvent01", event01VO);
        System.out.println(">>>>>" + event01VO.getID());
        System.out.println(">>>>>resultCount : " + resultCount);
        if (resultCount > 0) {
            return ServerResponse.createBySuccessMessage("创建成功");
        }

        return ServerResponse.createByErrorMessage("创建失败");
    }

    public SqlSession getSqlSession() {
        return sqlSession;
    }

    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }
}
