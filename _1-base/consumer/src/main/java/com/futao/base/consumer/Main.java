package com.futao.base.consumer;

import com.futao.base.api.dto.UserAddress;
import com.futao.base.consumer.service.OrderService;
import com.futao.base.consumer.service.impl.LocalStubCallService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author futao
 * @since ${DATE}
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:dubbo-consumer.xml");
        classPathXmlApplicationContext.start();
        System.out.println(classPathXmlApplicationContext.getBean(OrderService.class).initOrder("1"));
        // 每隔一秒循环调用，中途关闭ZK，会发现不会导致调用失败，因为消费者本地缓存了生产者的服务地址，所以ZK下线了也可以调到生产者
        while (true) {
            classPathXmlApplicationContext.getBean(LocalStubCallService.class).call();
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
