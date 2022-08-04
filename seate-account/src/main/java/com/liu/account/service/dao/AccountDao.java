package com.liu.account.service.dao;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void decreaseAccount(Long userId, BigDecimal money) {
		String sql = "update t_account set residue = residue - ?,used = used + ? where user_id = ?";
		jdbcTemplate.update(sql, new Object[] { money, money, userId });
	}

}
