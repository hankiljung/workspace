package test;

public class Student {
    String name;
    int age;
    String address;
    String hakNum;
    String phoneNum;
    public void setFirst(){
        name="kim";
        age = 20;
        address ="ulsan";
        hakNum = " 30303";
        phoneNum = " 010 2308 3234";
    }
    public void setName(String a){
        name = a;
    }
    public void setAddress(String a){
        address =a ;
    }
    public void  setAge(int a ){
        age = a;
    }
    public void setHakNum(String a){
        hakNum = a;
    }
    public  void setPhoneNum(String a){
        phoneNum = a;
    }





    public String nameSet(String a){
        name = a;
        return name;
    }
    public String addressSet(String a){
        address = a;
        return  address;
    }
    public String HakNumSet(String a){
        hakNum = a;
        return  hakNum;
    }
    public  String phoneNumSet(String a){
        phoneNum = a;
        return phoneNum;
    }
    public int ageSet(int a){
        age = a;
        return age;
    }
    public void printAll(){
        System.out.println("-----------------");
        System.out.println("이름 : " +name);
        System.out.println("나이 : " +age);
        System.out.println("이름 : " +address);
        System.out.println("학번 : " +hakNum);
        System.out.println("폰번호 : " +phoneNum);
        System.out.println("-----------------");

    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.nameSet("길동");
        student1.ageSet(20);
        student1.HakNumSet("30302");
        student1.addressSet("울산 중구");
        student1.phoneNumSet("010-2308-3234");
        student1.printAll();
    }
}
