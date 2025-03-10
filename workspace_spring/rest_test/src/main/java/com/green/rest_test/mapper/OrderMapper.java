package com.green.rest_test.mapper;

import com.green.rest_test.dto.OrderDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {

  public List<OrderDTO> selectAll(); /*모든 자료를 열람하는 쿼리*/
  public int insertInfo(OrderDTO orderDTO); /*자료를 입력하는 쿼리*/
  public OrderDTO selectOne(int orderNum); /*하나의 주문을 조회하는 쿼리*/
  public int deleteOne(int orderNum); /*하나의 주문 정보를 삭제하는 쿼리*/
  public int updateData(OrderDTO orderDTO); /*하나의 주문을 수정하는 쿼리*/

}
