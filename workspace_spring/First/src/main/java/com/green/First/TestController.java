
package com.green.First;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//anotaion 어노테이션
@RestController
public class TestController {

  @GetMapping("/t1")
  public String test1() {
    return "java";
  }

  @GetMapping("/t2")
  public int test2() {
    return 10;
  }

  @GetMapping("/person")
  public Person test3() {
    Person p1 = new Person("홍길동", 20, "울산시");
    return p1;
  }

  @GetMapping("/t4")
  public List<Person> test4() {
    //person 클래스에 대한 객체를 다수 저장할 수 있는 리스트 생성
    //자료형 변수명;
    List<Person> personList = new ArrayList<>();

    Person p1 = new Person("김길동", 22, "서울시");
    Person p2 = new Person("박길동", 25, "울산시");
    Person p3 = new Person("홍길동", 29, "부산시");

    personList.add(p1);
    personList.add(p2);
    personList.add(p3);

    return personList;
  }

  @GetMapping("/t5")
  public List<Student> test5() {
    List<Student> stuList = new ArrayList<>();
    stuList.add(new Student("김길동", 43, 21, 35));
    stuList.add(new Student("박길동", 52, 63, 52));
    stuList.add(new Student("이길동", 55, 51, 71));
    stuList.add(new Student("정길동", 59, 54, 46));
    stuList.add(new Student("라길동", 81, 92, 53));
    stuList.add(new Student("나길동", 52, 77, 78));

    return stuList;
  }

  @GetMapping("/t6")
  public List<Student> test6() {
    List<Student> stuList = new ArrayList<>();
    stuList.add(new Student("김길동", 43, 21, 35));
    stuList.add(new Student("박길동", 52, 63, 52));
    stuList.add(new Student("이길동", 55, 51, 71));
    stuList.add(new Student("정길동", 59, 54, 46));
    stuList.add(new Student("라길동", 81, 92, 53));
    stuList.add(new Student("나길동", 52, 77, 78));

    return stuList;
  }


  /// 리액트에서 전달하는 데이터블 자바에서 받는문법은 2가지 존재
  // 1. 클래스를 활용하는 방법
  //react에서 전달하는 객체의 key와
  //자바에서 데이터를 위해 매개변수에 선언한 클래스의 변수명이 동일하면
  //데이터를 자동으로 받아옴

  // collection Framework의 Map을 활용하는 방법
  @PostMapping("/t7")
  public void test7(@RequestBody Student student) {
    System.out.println(123);
    System.out.println(student.toString());

  }

  @PostMapping("/t8")/*DTO : Data Transfer Object*/
  public int test8(@RequestBody Student student) {
    System.out.println(123);
    System.out.println(student.toString());
    int sum = student.getEngScore()+student.getKorScore()+student.getMathScore();
    return  sum;
  }

  @PostMapping("/t9")/*DTO : Data Transfer Object*/
  public void test9(@RequestBody Food food) {
    System.out.println(food.toString());
  }


  @GetMapping("/t10")
  public int lottoNum() {

    return (int)(Math.random() * 45 + 1);
  }


  @GetMapping("/t11")
  public  List<TextLIst> textList() {
    List<TextLIst> textList = new ArrayList<>();
    textList.add(new TextLIst(5,"제목입니다1","김자바",5));
    textList.add(new TextLIst(4,"제목입니다2","김자바",3));
    textList.add(new TextLIst(3,"제목입니다3","김자바",0));
    textList.add(new TextLIst(2,"제목입니다4","김자바",10));
    textList.add(new TextLIst(1,"제목입니다5","김자바",1));

  return textList;
  }

  @GetMapping("/t12")
  public  List<ShopList> shopList() {
    List<ShopList> shopList = new ArrayList<>();
    shopList.add(new ShopList("ohng",101,1, "맨투맨 긴팔 티셔츠",12000,3));
    shopList.add(new ShopList("ohng",102,2, "롱 패딩",55000,1));
    shopList.add(new ShopList("ohng",103,3, "오버핏 니트",25000,2));
    shopList.add(new ShopList("ohng",104,4, "맨투맨 반팔 티셔츠",10000,3));
    shopList.add(new ShopList("ohng",105,5, "데님 청바지",15000,2));

    return shopList;
  }


  @GetMapping("/t14")
  public List<ShoppingList> list(){
    List<ShoppingList> list = new ArrayList<>();
    /*(int orderNum, int modelNum, String model, int price, int num, String id)*/
    list.add(new ShoppingList(1, 101, "데님청바지", 15000, 2, "id1"));
    list.add(new ShoppingList(2, 102, "맨투맨 반팔 티셔츠", 10000, 3, "id2"));
    list.add(new ShoppingList(3, 103, "오버핏 니트", 25000, 2, "id3"));
    list.add(new ShoppingList(4, 104, "롱 패딩", 55000, 1, "id4"));
    list.add(new ShoppingList(5, 105, "맨투맨 긴팔 티셔츠", 12000, 3, "id5"));

    return list;
  }



}
