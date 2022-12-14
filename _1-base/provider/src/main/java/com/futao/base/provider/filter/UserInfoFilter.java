package com.futao.base.provider.filter;

import org.apache.dubbo.common.constants.CommonConstants;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.*;
import org.springframework.util.StringUtils;

import java.util.UUID;

/**
 * @author futao
 * @since 2022/8/8
 */
@Activate(group = {CommonConstants.CONSUMER, CommonConstants.PROVIDER})
public class UserInfoFilter implements Filter {

    private static final String USER_ID = "userId";

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        RpcServiceContext rpcServiceContext = RpcContext.getServiceContext();
        String serviceName = invocation.getServiceName();
        if (!StringUtils.isEmpty(serviceName) && !serviceName.startsWith("org.apache.dubbo")) {
            System.out.println("serviceName:methodName:" + serviceName + "-" + invocation.getMethodName());
        }
        if (rpcServiceContext.isConsumerSide()) {
            // 当前是消费者
            // 设置traceId
            String value = UUID.randomUUID().toString();
            rpcServiceContext.setAttachment(USER_ID, value);
            System.out.println("设置userId:" + value);
        } else {
            // 当前是生产者
            String attachment = rpcServiceContext.getAttachment(USER_ID);
            System.out.println("当前用户为:" + attachment);
        }
        return invoker.invoke(invocation);
    }
}
