package vip.ckbiz.controller.wechat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import vip.ckbiz.service.EventAPIService;

/**
 * 微信API
 * Event活动Controller
 */
@Controller
@RequestMapping("/wechat/api/event/")
public class EventAPIController {

    @Autowired
    private EventAPIService eventAPIService;



    public EventAPIService getEventAPIService() {
        return eventAPIService;
    }

    public void setEventAPIService(EventAPIService eventAPIService) {
        this.eventAPIService = eventAPIService;
    }
}
