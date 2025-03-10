import java.util.Scanner;

public class IF_ELSEIF_ELSE_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //조건이 3개 이상일 때 사용
        //정수가 짝수면 1출력, 홀수면 2출력, 0이면 3출력
        System.out.println("정수를 입력하세요 : ");
        int a = sc.nextInt();
        if(a==0){
            System.out.println("0입니다");

        }
        else if(a % 2 ==0){
            System.out.println("짝수입니다");
        /*else if는 여러번 사용 가능합니다.*/
        }
        else {
            System.out.println("홀수입니다.");
        }

    }
}
