package com.liu.order.service.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*ʡ�� get set */
@Data
/* ȫ���������� */
@AllArgsConstructor
/* �޲ι��������ղι������� */
@NoArgsConstructor
public class Order {
	private Long id;

	private Long userId;

	private Long productId;

	private Integer count;

	private BigDecimal money;

	// ����״̬��0: ������, 1: �����
	private Integer state;
}
