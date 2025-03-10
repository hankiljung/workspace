package com.green.shop.service;

import com.green.shop.dto.ShopDTO;
import com.green.shop.mapper.ShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService{
  private ShopMapper shopMapper;

  @Autowired
  public ShopServiceImpl(ShopMapper shopMapper) {
    this.shopMapper = shopMapper;
  }

  @Override
  public int insertItem(ShopDTO shopDTO) {
    return shopMapper.insertItem(shopDTO);
  }

  @Override
  public List<ShopDTO> selectItem() {
    return shopMapper.selectItem();
  }

  @Override
  public ShopDTO byNum(int itemCode) {
    return shopMapper.byNum(itemCode);
  }

  @Override
  public int deleteByNum(int itemCode) {
    return shopMapper.deleteByNum(itemCode) ;
  }

  @Override
  public int updateByNum( ShopDTO shopDTO) {
    return shopMapper.updatByNum(shopDTO);
  }
}
