package com.liu.order.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*ʡ�� get set */
@Data
/* ȫ���������� */
@AllArgsConstructor
/* �޲ι��������ղι������� */
@NoArgsConstructor
public class CommonResult<T> {
	/* 404 not found */
	private Integer code;

	/* ��Ϣ��success failure */
	private String message;

	/* ���� */
	private T data;

	public CommonResult(Integer code, String message) {
		this(code, message, null);
	}
}
