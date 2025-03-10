package com.green.First;

public class Food {
  private String name;
  private int su;
  private String topping;
  private String yogu;
  private String date;

  public Food(String name, int su, String topping, String yogu, String date) {

    this.name = name;
    this.su = su;
    this.topping = topping;
    this.yogu = yogu;
    this.date = date;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSu() {
    return su;
  }

  public void setSu(int su) {
    this.su = su;
  }

  public String getTopping() {
    return topping;
  }

  public void setTopping(String topping) {
    this.topping = topping;
  }

  public String getYogu() {
    return yogu;
  }

  public void setYogu(String yogu) {
    this.yogu = yogu;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return "Food{" +
        "name='" + name + '\'' +
        ", su=" + su +
        ", topping='" + topping + '\'' +
        ", yogu='" + yogu + '\'' +
        ", date='" + date + '\'' +
        '}';
  }
}
