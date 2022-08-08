package com.futao.base.consumer;

import com.futao.base.api.service.AttachmentService;
import org.apache.dubbo.rpc.RpcContext;
import org.apache.dubbo.rpc.service.GenericService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author futao
 * @since ${DATE}
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:dubbo-consumer.xml");
        classPathXmlApplicationContext.start();
        // System.out.println(classPathXmlApplicationContext.getBean(OrderService.class).initOrder("1"));
        // 每隔一秒循环调用，中途关闭ZK，会发现不会导致调用失败，因为消费者本地缓存了生产者的服务地址，所以ZK下线了也可以调到生产者
        // while (true) {
        //     classPathXmlApplicationContext.getBean(LocalStubCallService.class).call();
        //     TimeUnit.SECONDS.sleep(1);
        // }

        // classPathXmlApplicationContext.getBean(GroupServiceConsumer.class).ga();
        // classPathXmlApplicationContext.getBean(GroupServiceConsumer.class).gb();


        // try {
        //     classPathXmlApplicationContext.getBean(ValidService.class).addUserAddress(new UserAddress());
        //     classPathXmlApplicationContext.getBean(ValidService.class).updateUserAddress(new UserAddress());
        // } catch (Exception e) {
        //     System.out.println(((ValidationException) e).getMessage());
        // }

        // GenericService genericService = (GenericService) classPathXmlApplicationContext.getBean("userAddressServiceGeneric");
        // System.out.println(genericService.$invoke("byUserId", new String[]{String.class.getName()}, new Object[]{"1"}));


        RpcContext.getClientAttachment().setAttachment("user.name", "李达康");
        classPathXmlApplicationContext.getBean(AttachmentService.class).attachment();

    }
}
