package com.liu.order.service.model;

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
public class Order {
	private Long id;

	private Long userId;

	private Long productId;

	private Integer count;

	private BigDecimal money;

	// 订单状态：0: 创建中, 1: 已完成
	private Integer state;
}
