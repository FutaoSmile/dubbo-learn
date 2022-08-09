package com.futao.sb.provider.service.service;

import com.futao.base.api.dto.UserAddress;
import com.futao.base.api.service.LocalStubService;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author futao
 * @since 2022/8/8
 */
@Service("localStubService")
public class LocalStubServiceImpl implements LocalStubService {
    @Override
    public boolean save(UserAddress address) {
        System.out.println("我被调用了" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        return address != null;
    }
}
