package vip.ckbiz.controller.wechat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import vip.ckbiz.common.ServerResponse;
import vip.ckbiz.service.EventAPIService;
import vip.ckbiz.util.Box;
import vip.ckbiz.util.HttpUtility;
import vip.ckbiz.vo.EVENT01VO;

import javax.servlet.http.HttpServletRequest;

/**
 * 微信API
 * Event活动Controller
 */
@Controller
@RequestMapping("/wechat/api/event/")
public class EventAPIController {

    @Autowired
    private EventAPIService eventAPIService;

    @RequestMapping(value = "save.do", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public ServerResponse insertEvent01(HttpServletRequest request) throws Exception {
        Box box = HttpUtility.getBox(request);
        EVENT01VO event01VO = new EVENT01VO();
        event01VO.setPUBLISHER(box.get("PUBLISHER"));
        event01VO.setTITLE(box.get("TITLE"));
        event01VO.setDESCRIPTION(box.get("DESCRIPTION"));
        event01VO.setPIC(box.get("PIC"));
        event01VO.setEVENT_TYPE(box.get("EVENT_TYPE"));
        event01VO.setISSHOW(box.get("ISSHOW"));
        event01VO.setSTARTTIME(box.get("STARTTIME"));
        event01VO.setENDTIME(box.get("ENDTIME"));
        event01VO.setADDRESS(box.get("ADDRESS"));
        event01VO.setLATITUDE(box.get("LATITUDE"));
        event01VO.setLONGITUDE(box.get("LONGITUDE"));
        event01VO.setPEOPLENUM(box.get("PEOPLENUM"));
        System.out.println(">>>>EVENT01:>>>" + event01VO.toString());

        return eventAPIService.insertEvent01(event01VO);
    }

    public EventAPIService getEventAPIService() {
        return eventAPIService;
    }

    public void setEventAPIService(EventAPIService eventAPIService) {
        this.eventAPIService = eventAPIService;
    }
}
