package test;

public class ManTest2 {
    public static void main(String[] args) {
        Man2 ma1 = new Man2();
        ma1.setName("홀길돌");
        ma1.setAge(256);
        ma1.setAddress("울산");
        ma1.printInfo();
        ma1.getAge();

        //이름 데이터 출력
        System.out.println(ma1.getName());

    }
}
