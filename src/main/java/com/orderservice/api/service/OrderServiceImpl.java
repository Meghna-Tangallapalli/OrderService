package com.orderservice.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderservice.api.model.OrderEntity;
import com.orderservice.api.repository.OrderRepository;
import com.orderservice.api.vo.OrderVo;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public OrderVo saveOrder(OrderVo orderVo) {
	
		//vo to entity
		OrderEntity orderEntity= new OrderEntity();
		orderEntity.setId(orderVo.getId());
		orderEntity.setName(orderVo.getName());
		orderEntity.setQty(orderVo.getQty());
		orderEntity.setPrice(orderVo.getPrice());
	
		OrderEntity save= orderRepository.save(orderEntity);
		
		OrderVo orderVo1= new OrderVo();
		orderVo1.setId(save.getid());
		
		
		
		
	}
	
	


}
