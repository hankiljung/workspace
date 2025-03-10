package com.green.shop_item.service;

import com.green.shop_item.dto.OrderDTO;
import com.green.shop_item.dto.SearchDTO;
import com.green.shop_item.dto.ShopItemDTO;
import com.green.shop_item.mapper.ShopItemMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ShopItemServiceImpl implements ShopItemService{
  ShopItemMapper shopItemMapper;

  @Autowired
  public ShopItemServiceImpl(ShopItemMapper shopItemMapper) {
    this.shopItemMapper = shopItemMapper;
  }

  @Override
  public void insertItem(ShopItemDTO shopItemDTO) {
    shopItemMapper.insertItem(shopItemDTO);
  }

  @Override
  public List<ShopItemDTO> selectAll(SearchDTO searchDTO) {
    return shopItemMapper.selectAll(searchDTO);
  }

  @Override
  public ShopItemDTO selectByNum(int itemNum) {
    return shopItemMapper.selectByNum(itemNum);
  }


  @Override
  public void updateItem(ShopItemDTO shopItemDTO) {
    shopItemMapper.updateItem(shopItemDTO);
  }

  @Override
  public void insertOrder(OrderDTO order) {
    shopItemMapper.insertOrder(order);
  }

  @Override
  public List<OrderDTO> selectOrder() {
    return shopItemMapper.selectOrder();
  }
}
