package study;
// 클래스가 명시적으로 상속을 받고 있지 않으면
// 자동으로 Object 클래스를 상속 받는다.
// 모든 클래스는 Object 클래스를 상속받고 있음.
// 다
public class TvTest {
  public static void main(String[] args) {
    Tv tv = new Tv();



    tv.turnOn();
    tv.toString();

    Object tv1 = new Tv();
    Object tv2 = new Tv();
    Object o1 = new StrawberryCheeseCake();
    Object o2 = new CheeseCake();


  }
}
