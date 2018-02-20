package vip.ckbiz.service;

import vip.ckbiz.common.ServerResponse;
import vip.ckbiz.vo.CategoryVO;

public interface CategoryService {

    ServerResponse addCategory(CategoryVO categoryVO);
    ServerResponse updateCategoryName(CategoryVO categoryVO);

}
