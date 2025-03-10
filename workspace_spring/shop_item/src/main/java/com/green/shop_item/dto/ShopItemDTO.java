package com.green.shop_item.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Setter
@Getter
@ToString

public class ShopItemDTO {
  private int itemNum;
  private String itemName;
  private int itemPrice;
  private String seller;
  private String itemIntro;
  private LocalDateTime regDate;

}
