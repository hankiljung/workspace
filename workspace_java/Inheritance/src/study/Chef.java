package study;

///  상속관계에 있는 두 클래스에서
///  자식클래스에서 부모클래스의 메소드명과 매개변수 정보를
/// 동일하게 작성해도 메서드 선언을 허용
/// 매서드 오버라이딩이라고 한다.
/// 오버라이딩을 하면 부모클래스에서 정의한 메서드를 덮어써버림
/// 부모클래스에서 정의한 메서드 호출불가!!!
class Chef {
    int x ;
  public void makeCook(){
    System.out.println("쉐프가 요리를 합니다");

  }
}

class MasterChef extends Chef{
    int x ;
  public void giveOrder(){

    System.out.println("후임 요리사에게 지시를 합니다");
    super.makeCook();
    makeCook(); // this를 생략한것과 같다.
    this.makeCook();
  }
  public void makeCook(){

    System.out.println("마스터 쉐프가 요리를 합니다.");

  }
}

