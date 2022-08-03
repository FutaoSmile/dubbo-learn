package com.futao.base.api.service;



import com.futao.base.api.dto.UserAddress;

import java.util.List;

/**
 * @author futao
 * @since 2022/8/3
 */
public interface UserAddressService {
    public List<UserAddress> byUserId(String userId);
}
