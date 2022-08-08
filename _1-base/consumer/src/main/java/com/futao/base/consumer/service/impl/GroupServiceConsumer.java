package com.futao.base.consumer.service.impl;

import com.futao.base.api.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author futao
 * @since 2022/8/8
 */
@Service
public class GroupServiceConsumer {
    @Autowired
    private GroupService groupService;

    public void ga() {
        System.out.println(groupService.ga());
    }

    public void gb() {
        System.out.println(groupService.gb());
    }

}
