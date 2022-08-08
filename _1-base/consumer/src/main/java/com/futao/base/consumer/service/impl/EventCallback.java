package com.futao.base.consumer.service.impl;

import org.springframework.stereotype.Service;

/**
 * @author futao
 * @since 2022/8/8
 */
@Service
public class EventCallback {

    public void onInvoke(String param) {
        System.out.println(this.getClass() + "#onInvoke, param:" + param);
    }

    public void onReturn(String returnValue, String param) {
        System.out.println(this.getClass() + "onReturn:" + returnValue + ", param: " + param);
    }

    public void onThrow(Throwable t, String param) {
        System.out.println("param:" + param);
        t.printStackTrace();
    }
}
