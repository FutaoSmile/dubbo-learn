package com.example.httpgatewaydubbo.controller;

import lombok.Getter;
import lombok.Setter;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.rpc.service.GenericService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author futao
 * @since 2023/2/23
 */
@RequestMapping("/gateway")
@RestController
public class GatewayController {


    /**
     * 泛化调用实现网关功能
     *
     * @param p
     * @return
     */
    @PostMapping
    public Object exec(
            @RequestBody P p
    ) {
        ReferenceConfig<GenericService> genericServiceReferenceConfig = new ReferenceConfig<>();
        genericServiceReferenceConfig.setInterface(p.interfaceName);
        genericServiceReferenceConfig.setGeneric("true");
        GenericService genericService = genericServiceReferenceConfig.get();
        return genericService.$invoke(p.methodName, p.paramType, p.params);
    }

    @Getter
    @Setter
    public static class P {
        String interfaceName;
        String methodName;
        String[] paramType;
        Object[] params;
    }
}
