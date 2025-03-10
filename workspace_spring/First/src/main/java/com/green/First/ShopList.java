package com.green.First;


public class ShopList {
 private String id;
 private int modelNum;
 private int shopNum;
 private String modelName;
 private String price;
 private int num;
 private String totalPrice;


  public ShopList(String id, int modelNum, int shopNum, String modelName, int ab, int num) {
    this.id = id;
    this.modelNum = modelNum;
    this.shopNum = shopNum;
    this.modelName = modelName;
    this.price = Integer.toString(ab)+"원";
    this.num = num;
    this.totalPrice = Integer.toString(ab*num)+"원";
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public int getModelNum() {
    return modelNum;
  }

  public void setModelNum(int modelNum) {
    this.modelNum = modelNum;
  }

  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public String getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(String totalPrice) {
    this.totalPrice = totalPrice;
  }

  public int getShopNum() {
    return shopNum;
  }

  public void setShopNum(int shopNum) {
    this.shopNum = shopNum;
  }
}
