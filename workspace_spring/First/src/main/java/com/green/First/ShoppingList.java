package com.green.First;

public class ShoppingList {
  int orderNum;
  int modelNum;
  String model;
  String price;
  int num;
  String id;
  String totalPrice;

  public ShoppingList(int orderNum, int modelNum, String model, int price, int num, String id) {
    this.orderNum = orderNum;
    this.modelNum = modelNum;
    this.model = model;
    this.price = Integer.toString(price)+"원";
    this.num = num;
    this.id = id;
    this.totalPrice = Integer.toString(price*num)+"원";
  }
}
