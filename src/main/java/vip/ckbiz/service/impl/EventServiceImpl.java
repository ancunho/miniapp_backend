package vip.ckbiz.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import vip.ckbiz.service.EventService;

@Repository
public class EventServiceImpl implements EventService {

    private SqlSession sqlSession;


    public SqlSession getSqlSession() {
        return sqlSession;
    }

    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }
}
