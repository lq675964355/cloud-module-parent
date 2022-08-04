package com.liu.storage.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liu.storage.service.StorageService;
import com.liu.storage.service.model.CommonResult;
import com.liu.storage.service.model.Storage;

@RestController
public class StorageController {

	@Autowired
	private StorageService storageService;

	/**
	 * ¿Û¼õ¿â´æ
	 * 
	 * @param productId
	 * @param count
	 * @return
	 */
	@PostMapping("/storage/decreaseStorage")
	public CommonResult<Storage> decreaseStorage(Long productId, Integer count) {
		storageService.decreaseStorage(productId, count);
		return new CommonResult<Storage>(200, "¿Û¼õ¿â´æ³É¹¦£¡");
	}
}
