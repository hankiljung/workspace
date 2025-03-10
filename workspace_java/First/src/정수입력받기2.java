import java.util.Scanner;

public class 정수입력받기2 {
    public static void main(String[] args) {

        /*키보드 입력을 위한 변수 생성.*/
        Scanner sc =  new Scanner(System.in);

        /*"정수 A를 입력하세요"를 출력한다.*/
        System.out.printf("정수 A를 입력하세요");

        /*a변수에 입력받은 값을 넣는다.*/
        long a =sc.nextLong();

        /*"정수 B를 입력하세요"를 출력한다.*/
        System.out.printf("정수 B를 입력하세요");

        /*b변수에 입력받은 값을 넣는다.*/
        long b =sc.nextLong();

        /*입력받을 값의 합을 출력한다.*/
        System.out.printf("정수 A + B = " +(a+b));
    }
}
