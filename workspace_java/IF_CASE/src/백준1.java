import java.util.Scanner;

public class 백준1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b;
        int a;
        System.out.print("수1");
        b = sc.nextInt();
        System.out.print("수2");
        a = sc.nextInt();

        int one = a%10 ;
        int ten = (a/10)%10;
        int bak = a/100;

        System.out.println(one*b);
        System.out.println(ten*b);
        System.out.println(bak*b);
        System.out.println(a*b);
    }

}
