package study;
/// 메서드 (method) : 반복 사요오디는 기능을 하나의 기능상자로 표현한 것
/// 이러한 것을 대부분 언어에선느 함수(function)라고 표현 함

/// 메서드 사용 방법
/*1. 메서드를 정의한다.*/
    /*메서드의 정의는 클래스 안 그리고 또 다른 메서드 밖에서 작성.*/
    /*메서드의 정의 문법
    * 접근제한자 + [static] + 리턴타입 + 메서드명(매개변수들){
       메서드 내용...
      }
      * 지금 현재 접근 제한자는 무조건 public으로 사용한다.
      * 접근 제한자 뒤에는 static 키워드를 사용한다.
      * 메서드명은 소문자로 작성
      * 메서드는 필요한 만큼 정의가 가능하다.
      * 메서드명은 중복이 안된다.
      * 한번 정의한 메서드는 여러번 호출이 가능하다.
      * */
/*2. 정의된 메서드를 호출한다(사용한다.).*/
    /* 정의된 메서드를 사용하기 위해서는 메서드 호출을 해야하는데
        호출은 '메서드명()' 로 작성한다.
        * */
/*3. 메소드는 오버 로딩 가능하다. 대신 괄호 안에 변수가 다르거나 변수의 개수가 달라야함*/
public class Method_01 {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        System.out.println();
        printHello();// 메서드를 호출
        System.out.println();
        System.out.println("프로그램 종료");

    }

    public static void printHello(){
        System.out.println("hello!");
    }


}

