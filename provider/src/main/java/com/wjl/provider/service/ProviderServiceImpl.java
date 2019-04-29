package com.wjl.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.wjl.common.service.ProviderService;

/**
 * @author: kevin
 * @date: 2019/4/25 11:43
 * Description:
 */
@Service
public class ProviderServiceImpl implements ProviderService {

	@Override
	public String provider() {
		return "provider success";
	}
}
