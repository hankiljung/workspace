import java.util.Scanner;

public class 문제1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("정수1 입력 : ");
        a=sc.nextInt();
        System.out.println("정수2 입력 : ");
        b=sc.nextInt();
        if(a>b){
            System.out.println("a가 큽니다");
        }
        else if(b>a){
            System.out.println("b가 큽니다");

        }
        else {
            System.out.println("같습니다");
        }
    }
}
