package com.green.shop_item.mapper;

import com.green.shop_item.dto.OrderDTO;
import com.green.shop_item.dto.SearchDTO;
import com.green.shop_item.dto.ShopItemDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShopItemMapper {

  /// 아이템 추가 쿼리
  void insertItem(ShopItemDTO shopItemDTO);

  /// 아이템 리스트 조회 쿼리
  List<ShopItemDTO> selectAll(SearchDTO searchDTO);

  /// 번호로 아이템 조회 쿼리
  ShopItemDTO selectByNum(int itemNum);

  ///  번호로 아이템 수정
  void updateItem(ShopItemDTO shopItemDTO);

  /// 주문하기
  void insertOrder(OrderDTO order);

  /// 주문 목록 조회 쿼리
  List<OrderDTO> selectOrder();

}
