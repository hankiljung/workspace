import java.util.Scanner;

public class 문제1_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        int min;
        int max;

        System.out.print("1번 정수");
        a = sc.nextInt();
        System.out.print("2번 정수");
        b=sc.nextInt();
        if(a>b) {
            max=a;
            min=b;
        System.out.println(max +">"+ min);
        }
        else if(b>a) {
            max=b;
            min=a;
        System.out.println(max +">"+ min);
        }
        else {
            System.out.println("a=b");
        }
    }
}
