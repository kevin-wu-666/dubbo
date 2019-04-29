package com.wjl.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wjl.common.service.ProviderService;
import com.wjl.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: kevin
 * @date: 2019/4/25 11:33
 * Description:
 */
@RestController
public class ConsumerCtrl {
	@Autowired
	private ConsumerService consumerService;
	@Reference
	private ProviderService providerService;

	@GetMapping("/consumer")
	public String consumer() {
		return consumerService.consumer();
	}

	@GetMapping("/test")
	public String test() {
		/**
		 * 此处如果直接Controller调Dubbo暴露的Service ： providerService
		 * 需要在配置文件中更改scan: com.wjl.consumer.service
		 * 为scan: com.wjl.consumer.service,com.wjl.consumer.controller
		 */
		return providerService.provider();
	}
}
