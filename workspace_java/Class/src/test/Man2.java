package test;
// setter -> 맴버변수 하나의 값을 변경시키는 메서드
//              -> setter 메서드는 이름이 정해져 있음(set+맴버변수명)
//              -> setter 메서드는 맴버변수 하나의 값을 변경시키는 메서드
//              -> setter 메서드는 void

// getter -> 맴버변수 하나의 값을 리턴하는 메서드
//              -> getter 메서드는 이름이 정해져 있음(get+맴버변수명)

public class Man2 {
    String name ;
    int age;
    String address;

    public void Man2(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void printInfo(){
        System.out.println("이름 : " + getName());
        System.out.println("나이 : " + getAge());
        System.out.println("주소 : " + getAddress());
    }

}
