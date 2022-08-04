package com.liu.order.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*省掉 get set */
@Data
/* 全参数构造器 */
@AllArgsConstructor
/* 无参构造器（空参构造器） */
@NoArgsConstructor
public class CommonResult<T> {
	/* 404 not found */
	private Integer code;

	/* 消息：success failure */
	private String message;

	/* 数据 */
	private T data;

	public CommonResult(Integer code, String message) {
		this(code, message, null);
	}
}
