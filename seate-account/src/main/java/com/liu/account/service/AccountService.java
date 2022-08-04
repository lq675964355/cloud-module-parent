package com.liu.account.service;

import java.math.BigDecimal;

public interface AccountService {

	void decreaseAccount(Long userId, BigDecimal money) throws Exception;

}
