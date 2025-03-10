package com.green.rest_test.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderDTO {
  private int orderNum;
  private String modelName;
  private String price;
  private int num;
  private String id;
  private String totalPrice;

  public OrderDTO() {
  }

  public OrderDTO(int orderNum, String modelName, int price, int num, String id) {
    this.orderNum = orderNum;
    this.modelName = modelName;
    this.price = price+"원";
    this.num = num;
    this.id = id;
    this.totalPrice = (price*num)+"원" ;
  }
}
