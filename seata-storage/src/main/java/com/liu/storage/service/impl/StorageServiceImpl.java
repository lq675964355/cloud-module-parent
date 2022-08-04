package com.liu.storage.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.liu.storage.service.StorageService;
import com.liu.storage.service.dao.StorageDao;

@Service
public class StorageServiceImpl implements StorageService {

	private static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class);

	@Resource
	private StorageDao storageDao;

	// �ۼ����
	@Override
	public void decreaseStorage(Long productId, Integer count) {
		LOGGER.info("------->storage-service�пۼ���濪ʼ");
		storageDao.decreaseStorage(productId, count);
		LOGGER.info("------->storage-service�пۼ�������");
	}

}
