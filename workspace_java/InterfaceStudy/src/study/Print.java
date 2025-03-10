package study;

//interface는 class와 동일하게 앞글자 대문자 작성
//클래스의 구성요소 :  맴버변수, 메서드의 정의, 생성자
//인터페이스의 구성요소 : 추상메서드.
public interface Print {

  //메서드의 정의는 있지만, 내용부가 없는 메서드를 추상메서드로 부름

  //흑백 출력 기능
  public void print();

  //컬러 출력 기능
  public void colorPrint();

}
