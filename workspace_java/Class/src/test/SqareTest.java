package test;

public class SqareTest {
    public static void main(String[] args) {
        Square r = new Square();
        Square s = new Square(1, 1, 2, 3);

        r.show();
        s.show();
        r.set(-2, 2, -1, 4);
        r.show();
        if (r.equals(s)) {
            System.out.println("---------------------------------------------------------------");
            System.out.println("두 사각형은 같습니다.");
            System.out.println("---------------------------------------------------------------");
        } else {
            System.out.println("---------------------------------------------------------------");
            System.out.println("두 사각형은 다르다");
            System.out.println("---------------------------------------------------------------");
        }
    }
}
