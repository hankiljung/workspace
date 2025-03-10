package test;

public class Member {
    String name;
    String id;
    String password;
    int age;

    public void setInfo(String a, String b, String c , int age1){
        name = a;
        id = b;
        password = c;
        age = age1;
    }

    public void printInfo(){
        System.out.println("----------------------------");
        System.out.println("1. 이름 : " + name);
        System.out.println("2. 아이디 : " + id);
        System.out.println("3. 패스워드  : " + password);
        System.out.println("4. 나이 : " + age);
        System.out.println("----------------------------");

    }
}
