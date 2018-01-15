package vip.ckbiz.controller.portal;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import vip.ckbiz.common.ServerResponse;
import vip.ckbiz.service.UserService;
import vip.ckbiz.vo.USERVO;

import java.util.List;

@Controller
@RequestMapping("/u/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "getAllUser.do")
    @ResponseBody
    public ServerResponse<List<USERVO>> getAllUser() throws Exception {
        System.out.println(">>>>>>>>>>111");
        ServerResponse response = userService.getAllUser();
        System.out.println(">>>>>>>>>>222");
        return response;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
