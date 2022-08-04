package com.liu.storage.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*ʡ�� get set */
@Data
/* ȫ���������� */
@AllArgsConstructor
/* �޲ι��������ղι������� */
@NoArgsConstructor
public class Storage {

	private Long id;

	// ��Ʒid
	private Long productId;

	// �ܿ��
	private Integer total;

	// ���ÿ��
	private Integer used;

	// ʣ����
	private Integer residue;
}
