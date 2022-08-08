package com.futao.base.provider.service;

import com.futao.base.api.dto.UserAddress;
import com.futao.base.api.service.ValidService;
import org.springframework.stereotype.Service;

/**
 * @author futao
 * @since 2022/8/8
 */
@Service("validService")
public class ValidServiceImpl implements ValidService {
    @Override
    public boolean addUserAddress(UserAddress userAddress) {
        System.out.println(userAddress);
        return true;
    }

    @Override
    public boolean updateUserAddress(UserAddress userAddress) {
        System.out.println(userAddress);
        return true;
    }
}
