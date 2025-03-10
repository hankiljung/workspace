package study;

public class Tv {
  String brand;

  public void turnOn(){
    System.out.println("TV on");
  }

  //Object 클래스의 toString() 메서드 오버라이딩

  //@Override : 메서드가 오버라이딩 문법에 맞는지 확인
  @Override
  public String toString() {
    return "Tv{" +
        "brand='" + brand + '\'' +
        '}';
  }
}

