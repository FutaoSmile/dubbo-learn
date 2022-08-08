package com.futao.base.provider.service;

import com.futao.base.api.service.EventCallbackService;
import org.springframework.stereotype.Service;

/**
 * @author futao
 * @since 2022/8/8
 */
@Service("eventCallbackService")
public class EventCallbackServiceImpl implements EventCallbackService {
    @Override
    public String success(String param) {
        return "成功";
    }

    @Override
    public String excep(String param) {
        int i = 0 / 0;
        return null;
    }
}
