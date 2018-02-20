package vip.ckbiz.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import vip.ckbiz.common.ServerResponse;
import vip.ckbiz.service.CategoryService;
import vip.ckbiz.vo.CategoryVO;

@Repository
public class CategoryServiceImpl implements CategoryService {

    private SqlSession sqlSession;

    public ServerResponse addCategory(CategoryVO categoryVO) {
        int resultCount = sqlSession.insert("CKBIZ.Category.addCategory", categoryVO);
        if (resultCount > 0) {
            return ServerResponse.createByErrorMessage("添加成功");
        }
        return ServerResponse.createByErrorMessage("添加失败");
    }

    public ServerResponse updateCategoryName(CategoryVO categoryVO) {
        int resultCount = sqlSession.update("CKBIZ.Category.updateCategoryName", categoryVO);
        if (resultCount > 0) {
            return ServerResponse.createBySuccessMessage("修改成功");
        }
        return ServerResponse.createByErrorMessage("添加失败");
    }

    public SqlSession getSqlSession() {
        return sqlSession;
    }

    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }
}
