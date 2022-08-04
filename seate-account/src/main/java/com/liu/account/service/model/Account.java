package com.liu.account.service.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*省掉 get set */
@Data
/* 全参数构造器 */
@AllArgsConstructor
/* 无参构造器（空参构造器） */
@NoArgsConstructor
public class Account {

	private Long id;

	// 用户id
	private Long userId;

	// 总额度
	private BigDecimal total;

	// 已用额度
	private BigDecimal used;

	// 剩余额度
	private BigDecimal residue;
}
