package com.futao.sb.provider.service.service;

import com.futao.base.api.service.AttachmentService;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.stereotype.Service;

/**
 * @author futao
 * @since 2022/8/8
 */
@Service("attachmentService")
public class AttachmentServiceImpl implements AttachmentService {
    @Override
    public String attachment() {
        String attachment = RpcContext.getServerAttachment().getAttachment("user.name");
        System.out.println("获取到的用户名为：" + attachment);
        return null;
    }
}
