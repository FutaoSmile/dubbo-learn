package com.futao.base.consumer.service.impl;

import com.futao.base.api.dto.UserAddress;
import com.futao.base.api.service.LocalStubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author futao
 * @since 2022/8/8
 */

@Service
public class LocalStubCallService {
    @Autowired
    private LocalStubService localStubService;

    public void call() {
        System.out.println(localStubService.save(new UserAddress()));
        System.out.println(localStubService.save(null));
    }
}
