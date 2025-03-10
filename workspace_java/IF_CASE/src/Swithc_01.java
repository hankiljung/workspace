/*조건문 중에서 switch case break문*/
/*조건이 맞은 case부터 아래의 모든 내용을 실행한다.*/
/*If문은 조건이 범위이면 if문 사용이 코딩에 수월*/
/*case문 조건이 특정 값이라면 switch문 사용이 수월*/
import java.util.Scanner;

/**/
public class Swithc_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*변수 선언*/
        int num ;

        System.out.print("정수입력 : ");
        num = sc.nextInt();

        switch(num){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default :
                System.out.println(4);
        }

    }
}
