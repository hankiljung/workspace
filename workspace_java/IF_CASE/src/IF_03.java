import java.util.Scanner;

public class IF_03 {
    public static void main(String[] args) {
        /// 키보드로 정수 두개를 입력받아,
        /// 입력 받은 두 수의 합이 10 이상이면서 짝수는 아닐 경우에만 "참"이라는 문자열  출력
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요 : ");
        int a = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요 : ");
        int b = sc.nextInt();
        if(a+b>=10  && (a+b)%2 == 1)
            System.out.println("참");


        else
            System.out.println("거짓");


    }
}
