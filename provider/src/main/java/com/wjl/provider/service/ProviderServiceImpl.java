package com.wjl.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.wjl.common.service.ProviderService;
import org.springframework.stereotype.Component;

/**
 * @author: kevin
 * @date: 2019/4/25 11:43
 * Description:
 */
@Service
@Component
public class ProviderServiceImpl implements ProviderService {

	@Override
	public String provider() {
		return "provider success";
	}
}
