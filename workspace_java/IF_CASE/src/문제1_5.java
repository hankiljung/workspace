import java.util.Scanner;

public class 문제1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("정수입력 : ");
        a=sc.nextInt();
        if (a%5==0) {
            System.out.println("5의배수");

        }
        else{
            System.out.println("5의 배수를 입력하세요");
        }
    }
}
