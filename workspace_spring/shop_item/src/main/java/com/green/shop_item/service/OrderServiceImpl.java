package com.green.shop_item.service;

import com.green.shop_item.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl  implements OrderService{
  OrderMapper orderMapper;

  @Autowired
  public OrderServiceImpl(OrderMapper orderMapper) {
    this.orderMapper = orderMapper;
  }
}



