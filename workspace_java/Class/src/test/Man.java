package test;

public class Man {
    String name;
    int age;
    String address;

    public void setName(String a){
        name = a;
    }
    public void setAge(int a ){
        age = a;
    }
    public void setAddress(String a){
        address = a;
    }

    public String nameSet(String a){
        name = a;
        return name;
    }
    public int ageSet(int a){
        age = a;
        return age;
    }
    public String addressSet(String a){
        address = a;
        return address;
    }
    public void printAll(){
        System.out.println("-----------------");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + address);
        System.out.println("-----------------");
    }

    public static void main(String[] args) {
        Man man1 = new Man();
        man1.nameSet("길동 홍");
        man1.ageSet(25);
        man1.addressSet("울산시 중구 학성동");
        man1.printAll();
    }
}
