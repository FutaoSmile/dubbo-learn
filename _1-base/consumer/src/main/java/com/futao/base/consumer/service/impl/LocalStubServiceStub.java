package com.futao.base.consumer.service.impl;

import com.futao.base.api.dto.UserAddress;
import com.futao.base.api.service.LocalStubService;

/**
 * 本地存根
 *
 * @author futao
 * @since 2022/8/8
 */
public class LocalStubServiceStub implements LocalStubService {

    private final LocalStubService localStubService;

    public LocalStubServiceStub(LocalStubService localStubService) {this.localStubService = localStubService;}

    @Override
    public boolean save(UserAddress address) {
        // 比如可以在调用方法之前做一些参数校验啥的，通过打印this可以发现，是同一个对象
        System.out.println("调用远程方法之前" + this);
        if (address == null) {
            // 如果参数为空，则直接返回，不调用第三方接口
            return false;
        }
        try {
            return localStubService.save(address);
        } catch (Exception e) {
            // 如果调用接口异常，本地可以包装一下
            return false;
        }
    }
}
