package com.futao.base.provider.service;

import com.futao.base.api.service.GroupService;
import org.springframework.stereotype.Service;

/**
 * @author futao
 * @since 2022/8/8
 */
@Service("groupService")
public class GroupServiceImpl implements GroupService {

    @Override
    public String ga() {
        return "ga";
    }

    @Override
    public String gb() {
        return "gb";
    }
}
