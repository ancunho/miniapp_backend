package vip.ckbiz.service;

import vip.ckbiz.common.ServerResponse;
import vip.ckbiz.vo.USERVO;

import java.util.List;

public interface UserService {

    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    ServerResponse<USERVO> login(String username, String password);

    /**
     * 用户注册
     * @param uservo
     * @return
     */
    ServerResponse<String> register(USERVO uservo);

    /**
     * 验证用户名和Email
     * @param str
     * @param type
     * @return
     */
    ServerResponse<String> checkValid(String str, String type);

}
