package com.green.rest_test.service;

import com.green.rest_test.dto.OrderDTO;

import java.util.List;

public interface RestService {

  List<OrderDTO> selectAll();
  OrderDTO selectOne(int orderNum);
  int insertInfo(OrderDTO orderDTO);
  public int deleteOne(int orderNum);
  public int updateData(OrderDTO orderDTO);

}
