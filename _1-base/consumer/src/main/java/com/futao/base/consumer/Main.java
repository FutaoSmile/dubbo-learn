package com.futao.base.consumer;

import com.futao.base.api.dto.UserAddress;
import com.futao.base.consumer.service.OrderService;
import com.futao.base.consumer.service.impl.LocalStubCallService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author futao
 * @since ${DATE}
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:dubbo-consumer.xml");
        classPathXmlApplicationContext.start();
        System.out.println(classPathXmlApplicationContext.getBean(OrderService.class).initOrder("1"));
        classPathXmlApplicationContext.getBean(LocalStubCallService.class).call();
    }
}
