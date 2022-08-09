package com.futao.sb.provider.service.service;


import com.futao.base.api.dto.UserAddress;
import com.futao.base.api.service.UserAddressService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author futao
 * @since 2022/8/3
 */
@Service("userAddressService")
public class UserAddressServiceImpl implements UserAddressService {
    @Override
    public List<UserAddress> byUserId(String userId) {
        // return Arrays.asList(new UserAddress(1, "1", true, "李达康", "18700001111", "浙江省杭州市"),
        //         new UserAddress(2, "1", false, "侯亮平", "15633334444", "上海市静安区")
        // );
        return null;
    }
}
