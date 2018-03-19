package vip.ckbiz.service;

import vip.ckbiz.common.ServerResponse;
import vip.ckbiz.vo.EVENT01VO;

import java.util.List;

/**
 * 微信API
 * Event活动接口
 */
public interface EventAPIService {

    /**
     * 查找所有活动
     * @return
     */
    public ServerResponse<List<EVENT01VO>> selectAllEvent01();

    /**
     * 创建Event
     * @param event01VO
     * @return
     */
    public ServerResponse insertEvent01(EVENT01VO event01VO);

}
