package vip.ckbiz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import vip.ckbiz.common.Const;
import vip.ckbiz.vo.USERVO;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/page/admin/")
public class PageAdminController {

    @RequestMapping(value = "login.do")
    public String admin_login(HttpSession session) {
        USERVO uservo = (USERVO) session.getAttribute(Const.CURRENT_USER);
        if (uservo != null) {
            return "redirect:/manage/category/list.do";
        }
        return "admin/login";
    }

    @RequestMapping(value = "category/new.do")
    public String admin_category_new(HttpSession session) {
        USERVO uservo = (USERVO) session.getAttribute(Const.CURRENT_USER);
        if (uservo == null) {
            return "admin/login";
        }
        return "admin/adminCategoryNew";
    }



}
