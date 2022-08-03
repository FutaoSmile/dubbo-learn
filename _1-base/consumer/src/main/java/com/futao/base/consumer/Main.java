package com.futao.base.consumer;

import com.futao.base.api.dto.UserAddress;
import com.futao.base.consumer.service.OrderService;
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
        List<UserAddress> userAddresses = classPathXmlApplicationContext.getBean(OrderService.class).initOrder("1");
        System.out.println(userAddresses);
    }
}
