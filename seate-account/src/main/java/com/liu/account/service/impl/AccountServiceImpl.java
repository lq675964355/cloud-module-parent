package com.liu.account.service.impl;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.liu.account.service.AccountService;
import com.liu.account.service.dao.AccountDao;

@Service
public class AccountServiceImpl implements AccountService {

	private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);

	@Resource
	private AccountDao accountDao;

	@Override
	public void decreaseAccount(Long userId, BigDecimal money) throws Exception {
		LOGGER.info("------->account-service中扣减余额开始");
		if (money != null && money.compareTo(BigDecimal.valueOf(20)) < 0) {
			LOGGER.info("------->account-service异常了");
			throw new Exception();
		} else if (money != null && money.compareTo(BigDecimal.valueOf(50)) > 0) {
			LOGGER.info("------->account-service超时了");
			try {
				TimeUnit.SECONDS.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		accountDao.decreaseAccount(userId, money);
		LOGGER.info("------->account-service中扣减余额结束");
	}
}
