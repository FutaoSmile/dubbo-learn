package com.futao.sb.provider.service.service;

import com.futao.base.api.service.DirectLinkService;
import org.springframework.stereotype.Service;

/**
 * @author futao
 * @since 2022/8/8
 */
@Service("directLinkService")
public class DirectLinkServiceImpl implements DirectLinkService {

    @Override
    public String sayHi() {
        return "哈哈哈哈";
    }

}
