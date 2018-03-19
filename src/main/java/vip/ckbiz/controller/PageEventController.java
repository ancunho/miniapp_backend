package vip.ckbiz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/page/event/")
public class PageEventController {

    @RequestMapping(value = "save.do")
    public String event_save(ModelMap modelMap) {
        return "event/index";
    }

}
