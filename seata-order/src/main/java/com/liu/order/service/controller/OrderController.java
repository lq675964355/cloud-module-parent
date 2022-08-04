package com.liu.order.service.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.liu.order.service.OrderService;
import com.liu.order.service.model.CommonResult;
import com.liu.order.service.model.Order;

@RestController
public class OrderController {

	@Resource
	private OrderService orderService;

	@PostMapping("/order/createOrder")
	public CommonResult<Order> createOrder(@RequestBody Order order) {
		// 初始化设置订单状态为 0
		order.setState(0);
		orderService.createOrder(order);
		return new CommonResult<Order>(200, "订单创建成功");
	}
}
