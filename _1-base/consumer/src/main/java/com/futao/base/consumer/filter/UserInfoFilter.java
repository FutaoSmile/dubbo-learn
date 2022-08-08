package com.futao.base.consumer.filter;

import org.apache.dubbo.common.constants.CommonConstants;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.*;

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
        RpcContext rpcContext = RpcContext.getContext();
        if (rpcContext.isConsumerSide()) {
            // 当前是消费者
            // 设置traceId
            String value = UUID.randomUUID().toString();
            rpcContext.setAttachment(USER_ID, value);
            System.out.println("设置userId:" + value);
        } else {
            // 当前是生产者
            String attachment = rpcContext.getAttachment(USER_ID);
            System.out.println("当前用户为:" + attachment);
        }
        return invoker.invoke(invocation);
    }
}
