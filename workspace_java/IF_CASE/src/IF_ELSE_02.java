import java.util.Scanner;

public class IF_ELSE_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //키보드로 하나의 정수를 입력ㅁ받아
        // 그 수가 3의 배수이면 '3의 배수입니다.' 출력
        // 3의 배수가 아니면 '3의 배수가 아닙니다.' 출력
        int a;
        System.out.print("정수를 입력하세요 : ");
        a = sc.nextInt();
        if(a%3 == 0)
            System.out.println("3의 배수입니다.");
        else
            System.out.println("3의 배수가 아닙니다");
    }
}
