package com.green.shop_item.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class OrderDTO {
  private int orderNum;
  private int itemNum;
  private String buyer;
  private int buyCnt;
  private int buyPrice;
  private LocalDateTime buyDate;
  private ShopItemDTO shopItem;
}
