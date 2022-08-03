package com.futao.base.consumer.service.impl;

import com.futao.base.api.dto.UserAddress;
import com.futao.base.api.service.UserAddressService;
import com.futao.base.consumer.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author futao
 * @since 2022/8/3
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private UserAddressService userAddressService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        return userAddressService.byUserId("1");
    }
}
