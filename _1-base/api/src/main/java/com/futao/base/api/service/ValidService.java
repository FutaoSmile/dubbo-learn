package com.futao.base.api.service;

import com.futao.base.api.dto.UserAddress;

/**
 * @author futao
 * @since 2022/8/8
 */
public interface ValidService {

    @interface Save {}

    boolean addUserAddress(UserAddress userAddress);

    @interface Update {}

    boolean updateUserAddress(UserAddress userAddress);
}
