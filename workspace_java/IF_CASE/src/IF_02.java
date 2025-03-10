import java.util.Scanner;

public class IF_02 {
    public static void main(String[] args) {
        //키보드로 정수를 하나 입력받아
        //해당 정수가 짝수일때만 '참'이라는 문자열을 출력하는 코드
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("참");
        }
        else {
            System.out.println("거짓");
        }
        System.out.println("끝");
    }
}
