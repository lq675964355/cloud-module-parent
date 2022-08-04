package com.liu.account.service.controller;

import java.math.BigDecimal;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.liu.account.service.AccountService;
import com.liu.account.service.model.Account;
import com.liu.account.service.model.CommonResult;

@RestController
public class AccountController {

	@Resource
	private AccountService accountService;

	/**
	 * 扣减账户余额
	 * 
	 * @param userId
	 * @param money
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/account/decreaseAccount")
	public CommonResult<Account> decreaseAccount(@RequestParam("userId") Long userId,
			@RequestParam("money") BigDecimal money) throws Exception {
		accountService.decreaseAccount(userId, money);
		return new CommonResult<Account>(200, "扣减账户余额成功！");
	}
}
