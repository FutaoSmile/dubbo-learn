package com.futao.base.consumer.service;

import com.futao.base.api.dto.UserAddress;

import java.util.List;

/**
 * @author futao
 * @since 2022/8/3
 */
public interface OrderService {

    List<UserAddress> initOrder(String userId);
}
