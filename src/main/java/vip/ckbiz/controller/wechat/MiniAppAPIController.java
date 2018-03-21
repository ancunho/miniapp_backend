package vip.ckbiz.controller.wechat;


import com.google.gson.JsonParser;
import net.sf.jsqlparser.schema.Server;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import vip.ckbiz.common.ServerResponse;
import vip.ckbiz.util.Box;
import vip.ckbiz.util.HttpUtility;
import vip.ckbiz.util.PropertiesUtil;

import javax.servlet.http.HttpServletRequest;

/**
 * 微信小程序API控制器
 */
@Controller
@RequestMapping("/wechat/api/")
public class MiniAppAPIController {

    @RequestMapping(value = "getMiniappOpenID.do", method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse getOpenID(HttpServletRequest request) {
        Box box = HttpUtility.getBox(request);
        String MpAppID = PropertiesUtil.getProperty("miniAppId");
        String MpAppSecret = PropertiesUtil.getProperty("miniAppSecret");
        String code = box.get("code");
        if ("".equals(code)) {
            return ServerResponse.createByErrorMessage("参数错误[没有code]");
        }

        //授权（必填）
        String grant_type = "authorization_code";
        //URL
        String requestUrl = "https://api.weixin.qq.com/sns/jscode2session";
        //请求参数
        String params = "appid=" + MpAppID + "&secret=" + MpAppSecret + "&js_code=" + code + "&grant_type=" + grant_type;
        //发送请求
        String data = HttpUtility.getDataByURLConnection(requestUrl, params);

        if ("".equals(data)) {
            return ServerResponse.createByErrorMessage("网络错误，请稍后再试");
        }

//        if (new JsonParser().parse(data).getAsJsonObject().get("errcode").getAsString() != null) {
//            return ServerResponse.createByErrorMessage("错误，请重试");
//        }

        String openid = new JsonParser().parse(data).getAsJsonObject().get("openid").getAsString();

        if (openid == null || "".equals(openid)) {
            return ServerResponse.createByErrorMessage("openid为空，请重试");
        }

        return ServerResponse.createBySuccess("获取Openid成功", openid);
    }

}
