package com.liu.order.service.client;

import java.math.BigDecimal;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.liu.order.service.model.CommonResult;

@FeignClient(value = "seata-account-service")
public interface AccountService {

	@SuppressWarnings("rawtypes")
	@PostMapping(value = "/account/decreaseAccount")
	CommonResult decreaseAccount(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
