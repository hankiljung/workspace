import java.util.Scanner;

public class 문제1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("정수를 입력하세요");
        a = sc.nextInt();
        if(a%3==0){
            System.out.println("3의배수입니다");

        }
        else {
            System.out.println("3의 배수가 아닙니다.");
        }
    }
}
