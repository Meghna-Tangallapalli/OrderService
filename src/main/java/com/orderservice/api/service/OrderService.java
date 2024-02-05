package com.orderservice.api.service;

import org.springframework.stereotype.Component;

import com.orderservice.api.model.OrderEntity;
import com.orderservice.api.vo.OrderVo;

@Component
public interface OrderService {

	OrderVo saveOrder(OrderVo orderVo);
}
