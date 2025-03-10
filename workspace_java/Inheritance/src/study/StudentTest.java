package study;

public class StudentTest {
  public static void main(String[] args) {
    Student s1 = new Student(1, "김자바");
    Student s2 = new Student(1, "박자바");
    Boolean a =  s1.equals(s2);
    System.out.println(a);

    String str1 = new String("java");
    String str2 = "java";


    String str11 = "react";
    String str22 = str11;
    str11 = "java";

    String str33 = new String("jajva");
    String str44 = new String("jajva");

    System.out.println(str11);
    System.out.println(str22);

    if(str33.equals(str44)){
      System.out.println("str33과 str44는 같습니다");
    }

    // ==는 두 객체가 주소값이 같은지 비교하는 연산.
    // 숫자 비교 연산에서 사용.
    if(str11==str22){
      System.out.println("str11과 str22는같습니다");
    }

  }
}
