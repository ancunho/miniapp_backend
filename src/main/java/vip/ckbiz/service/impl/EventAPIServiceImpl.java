package vip.ckbiz.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import vip.ckbiz.service.EventAPIService;

/**
 * 微信API
 * Event活动接口
 */
@Repository
public class EventAPIServiceImpl implements EventAPIService {

    private SqlSession sqlSession;


    public SqlSession getSqlSession() {
        return sqlSession;
    }

    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }
}
