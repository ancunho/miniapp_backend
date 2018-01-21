package vip.ckbiz.controller.portal;


import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import vip.ckbiz.common.Const;
import vip.ckbiz.common.ServerResponse;
import vip.ckbiz.service.UserService;
import vip.ckbiz.util.MD5Utils;
import vip.ckbiz.vo.USERVO;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 用户登陆
     * @param username
     * @param password
     * @param session
     * @return
     */
    @RequestMapping(value = "login.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<USERVO> login(String username, String password, HttpSession session) {
        ServerResponse<USERVO> response = userService.login(username, password);
        if (response.isSuccess()) {
            session.setAttribute(Const.CURRENT_USER, response.getData());
        }
        return response;
    }

    /**
     * 用户注册
     * @param uservo
     * @return
     */
    @RequestMapping(value = "register.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> register(USERVO uservo) {
        ServerResponse validResponse = userService.checkValid(uservo.getUSERNAME(), Const.USERNAME);
        if (!validResponse.isSuccess()) {
            return ServerResponse.createByErrorMessage("用户名已存在");
        }

        validResponse = userService.checkValid(uservo.getEMAIL(), Const.EMAIL);
        if (!validResponse.isSuccess()) {
            return ServerResponse.createByErrorMessage("Email已存在");
        }

        uservo.setPASSWORD(MD5Utils.MD5EncodeUtf8(uservo.getPASSWORD()));
        uservo.setROLE(Const.Role.ROLE_CUSTOMER);

        return userService.register(uservo);
    }

    /**
     * 根据session获取用户信息
     * @param session
     * @return
     */
    @RequestMapping(value = "get_user_info.do", method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse<USERVO> getUserInfo(HttpSession session) {
        USERVO uservo = (USERVO) session.getAttribute(Const.CURRENT_USER);
        if (uservo != null) {
            return ServerResponse.createBySuccess(uservo);
        }

        return ServerResponse.createByErrorMessage("用户未登录，无法获取用户信息");
    }



    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
