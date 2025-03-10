package com.green.shop_item.service;

import com.green.shop_item.dto.OrderDTO;
import com.green.shop_item.dto.SearchDTO;
import com.green.shop_item.dto.ShopItemDTO;

import java.util.List;

public interface ShopItemService {
  // 아이템 추가 메서드
  void insertItem(ShopItemDTO shopItemDTO);

  // 아이템 리스트 조회 메서드
  List<ShopItemDTO> selectAll(SearchDTO searchDTO);

  // 번호로 아이템 조회 메서드
  ShopItemDTO selectByNum(int itemNum);

  // 번호로 아이템 수정 메서드
  void updateItem(ShopItemDTO shopItemDTO);

  void insertOrder(OrderDTO order);

  List<OrderDTO> selectOrder();
}
