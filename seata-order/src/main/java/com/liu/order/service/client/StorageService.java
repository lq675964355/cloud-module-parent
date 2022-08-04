package com.liu.order.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.liu.order.service.model.CommonResult;

@FeignClient(value = "seata-storage-service")
public interface StorageService {

	@SuppressWarnings("rawtypes")
	@PostMapping(value = "/storage/decreaseStorage")
	CommonResult decreaseStorage(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
