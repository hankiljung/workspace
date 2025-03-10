package test;

public class ManTest {
    public static void main(String[] args) {
        Man man1 = new Man();
        man1.nameSet("길동 홍");
        man1.ageSet(25);
        man1.addressSet("울산시 중구 학성동");
        man1.printAll();
    }
}
