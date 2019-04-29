package com.wjl.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wjl.common.service.ProviderService;
import org.springframework.stereotype.Service;

/**
 * @author: kevin
 * @date: 2019/4/25 11:43
 * Description:
 */
@Service
public class ConsumerServiceImpl implements ConsumerService {

	@Reference
	private ProviderService providerService;

	@Override
	public String consumer() {
		return providerService.provider();
	}
}
