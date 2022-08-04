package com.liu.order.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.liu.order.service.OrderService;
import com.liu.order.service.client.AccountService;
import com.liu.order.service.client.StorageService;
import com.liu.order.service.dao.OrderDao;
import com.liu.order.service.model.Order;

import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
	@Resource
	private OrderDao orderDao;

	@Resource
	private StorageService storageService;

	@Resource
	private AccountService accountService;

	/**
	 * �������� -> ���ÿ�����ۼ���� -> �����˻�����ۼ��˻���� -> �޸Ķ���״̬
	 */
	@GlobalTransactional(name = "gtx_create_order", rollbackFor = Exception.class)
	@Override
	public void createOrder(Order order) {
		// ��������
		log.info(">>>>>��ʼ��������");
		orderDao.createOrder(order);
		// �ۼ����
		log.info(">>>>>�ۼ����");
		storageService.decreaseStorage(order.getProductId(), order.getCount());
		// �ۼ����
		log.info(">>>>>�ۼ����");
		accountService.decreaseAccount(order.getUserId(), order.getMoney());
		// �޸ģ�������״̬
		log.info(">>>>>�޸ģ�������״̬");
		orderDao.updateOrderState(order.getUserId(), order.getState());
		log.info(">>>>>�������");
	}
}
