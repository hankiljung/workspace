package com.green.shop.service;


import com.green.shop.dto.ShopDTO;

import java.util.List;

public interface ShopService {


  public int insertItem(ShopDTO shopDTO);
  public List<ShopDTO> selectItem();
  public  ShopDTO byNum(int itemCode);
  public int deleteByNum(int itemCode);
  public int updateByNum (ShopDTO shopDTO);



}
