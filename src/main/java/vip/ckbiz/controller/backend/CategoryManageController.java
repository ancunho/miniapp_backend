package vip.ckbiz.controller.backend;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import vip.ckbiz.common.Const;
import vip.ckbiz.common.ResponseCode;
import vip.ckbiz.common.ServerResponse;
import vip.ckbiz.service.CategoryService;
import vip.ckbiz.service.UserService;
import vip.ckbiz.vo.CategoryVO;
import vip.ckbiz.vo.USERVO;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/manage/category/")
public class CategoryManageController {

    @Autowired
    private UserService userService;

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "add_category.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse addCategory(HttpSession session, String categoryName, @RequestParam(value = "parentId", defaultValue = "0") Integer parentId) {
        if (parentId == null || StringUtils.isBlank(categoryName)) {
            return ServerResponse.createByErrorMessage("参数错误");
        }
        USERVO uservo = (USERVO) session.getAttribute(Const.CURRENT_USER);
        if (uservo == null) {
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(), "用户未登录，请登录");
        }

        //관리원인지 판단
        if (userService.checkAdmin(uservo).isSuccess()) {
            CategoryVO categoryVO = new CategoryVO();
            categoryVO.setCATEGORYNAME(categoryName);
            categoryVO.setPARENT_ID(parentId);
            return categoryService.addCategory(categoryVO);
        } else {
            return ServerResponse.createByErrorMessage("无权限操作，需要管理员权限");
        }

    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public CategoryService getCategoryService() {
        return categoryService;
    }

    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
}
