package com.liu.account.service.model;

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
public class Account {

	private Long id;

	// �û�id
	private Long userId;

	// �ܶ��
	private BigDecimal total;

	// ���ö��
	private BigDecimal used;

	// ʣ����
	private BigDecimal residue;
}
