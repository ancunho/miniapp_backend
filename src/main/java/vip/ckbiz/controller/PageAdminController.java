package vip.ckbiz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
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
            return "redirect:/page/admin/category/list.do";
        }
        return "admin/login";
    }


    @RequestMapping(value = "category/list.do")
    public String admin_category_list(HttpSession session) {
        USERVO uservo = (USERVO) session.getAttribute(Const.CURRENT_USER);
        if (uservo == null) {
            return "redirect:/page/admin/login.do";
        }
        return "admin/adminCategoryList";

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
