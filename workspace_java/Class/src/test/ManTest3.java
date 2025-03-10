package test;

public class ManTest3 {
    public static void main(String[] args) {
        Man2 m1 = new Man2();
        m1.Man2("홍길동", 30, "울산시");
        Man2 m2 = new Man2();
        m2.Man2("김길동", 20, "서울시");

        if(m1.getAge()>m2.getAge()){
            System.out.println(m1.getName());
        }

        else{
            System.out.println(m2.getName());
        }

        if (m1.getAge()==30) {
            m1.setName("이순신");
        }

    }
}
