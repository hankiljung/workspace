import java.util.Scanner;

public class IF_ELSE_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //정수가 짝수이면 1 출력, 그렇지 않으면 2출력
        int a;
        a=sc.nextInt();
        if(a%2 ==0){
            System.out.println("참");

        }
        else
            System.out.println("거짓");
        //if와 else를 동시에 사용하면 둘 중 하나만 실행된다.

    }
}
