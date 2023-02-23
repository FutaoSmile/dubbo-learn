package com.example.httpgatewaydubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations = {"classpath:dubbo-consumer.xml"})
@SpringBootApplication
public class HttpGatewayDubboApplication {

    public static void main(String[] args) {
        SpringApplication.run(HttpGatewayDubboApplication.class, args);
    }

}
