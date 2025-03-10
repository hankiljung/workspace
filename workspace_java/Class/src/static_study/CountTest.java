package static_study;

/// static이 붙은 맴버변수는
/// 객체에 종속적이지 않고 모든 객체가 공유하는 데이터
/// static 변수는 생성자에서 초기화 하지 않는다.
/// static 변수는 초기화 구문이 따로 존재한다.

/// **생성자보다 static 초기화가 먼저 진행된다.**
//그래서 바로 객체 생성 없이 사용 가능하다

///  static 변수는 객체명.맴버변수;의 문법으로 호출 권장X ///
// static 변수는 클래스명. 변수명;
// static은 변수 및 메서드에 적용할 수 있다.
    //원래 메서드는 객체뒤에 붙지만 스태틱은 클래스뒤

public class CountTest {
    public static void main(String[] args) {
        Count cnt1 = new Count();
        Count cnt2 = new Count();
        Count cnt3 = new Count();

        //static 변수는 클래스명으로 접근
        System.out.println(Count.cnt);
    }
}