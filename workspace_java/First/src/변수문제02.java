import java.util.Map;

public class 변수문제02 {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        int c =30;
        int result = a+b+c;

        //1번 풀이 방법
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("a + b + c = "+(a+b+c));
        System.out.println("");

        int d = 1;
        double e = 2.2;
        e = d;
        System.out.println("d = "+d);
        System.out.println("e = "+e);
        System.out.println("");

        int num1;
        double num2 = 10.7;

        num1 = (int) num2;
        System.out.println(num1);

        int aa = 10;
        int bb = 20;
        int cc ;

        cc = aa;
        aa = bb;
        bb = cc;

        System.out.println("");
        System.out.println("aa = " + aa);
        System.out.println("bb = "  + bb);
    }
}
