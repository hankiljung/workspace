package study;

import java.util.ArrayList;
import java.util.List;

public class CakeTest2 {
  public static void main(String[] args) {
    Cake c1 = new Cake();
    Cake c2 = new CheeseCake();
    Cake c3 = new StrawberryCheeseCake();

    c1.eat();
    c2.eat();
    c3.eat();

    List<Cake> cakes = new ArrayList<>();

    cakes.add(0,c1);
    cakes.add(1,c2);
    cakes.add(2,c3);



    // 객체의 자료형이 다 다르다.
    // 각각의 메서드가 다 다르다.





  }
}
