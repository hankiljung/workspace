import java.util.Scanner;

public class 문제1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;
        System.out.println("정수 1을 입력하세요 : ");
        a = sc.nextInt();
        System.out.println("정수 2를 입력하세요 : ");
        b = sc.nextInt();

        if(a+b>50){
            System.out.println(" 두 수의 합이 50보다 큽니다.");
        }
        else{
            System.out.println("두 수의 합이 50 이하입니다.");
        }

    }
}
