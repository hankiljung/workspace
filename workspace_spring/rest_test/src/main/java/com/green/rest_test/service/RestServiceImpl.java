package com.green.rest_test.service;

import com.green.rest_test.dto.OrderDTO;
import com.green.rest_test.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestServiceImpl implements RestService{
  private OrderMapper orderMapper;

  @Autowired
  public RestServiceImpl(OrderMapper orderMapper) {
    this.orderMapper = orderMapper;
  }

  @Override
  public List<OrderDTO> selectAll() {
    System.out.println("정보를 열람합니다.");
    return orderMapper.selectAll();
  }

  @Override
  public int insertInfo(OrderDTO orderDTO) {
    System.out.println("정보를 입력하세요");
    return orderMapper.insertInfo(orderDTO);
  }

  @Override
  public OrderDTO selectOne(int orderNum) {
    return orderMapper.selectOne(orderNum);
  }

  @Override
  public int deleteOne(int orderNum) {
    return orderMapper.deleteOne(orderNum);
  }

  @Override
  public int updateData(OrderDTO orderDTO) {
    return orderMapper.updateData(orderDTO);
  }
}
