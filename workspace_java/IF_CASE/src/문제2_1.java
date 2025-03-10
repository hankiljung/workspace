import java.util.Scanner;

public class 문제2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("정수1");
        a=sc.nextInt();
        System.out.print("정수2");
        b=sc.nextInt();
        System.out.print("정수2");
        c=sc.nextInt();

        if(a+b>c&& a+c>b && b+c>a){
            System.out.println("삼각형 가능");
        }
    }
}
