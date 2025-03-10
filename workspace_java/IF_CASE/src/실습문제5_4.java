import java.util.Scanner;

public class 실습문제5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        String c;
        System.out.print("1수");
        a=sc.nextInt();
        System.out.print("2수");
        b=sc.nextInt();
        System.out.print("연산자를 입력하세요.");
        c=sc.next();

        switch (c){
            case"+" :
                System.out.println(a+b);
                break;
            case"-":
                System.out.println(a-b);
                break;
            case"*":
                System.out.println(a*b);
                break;
            case"/":
                System.out.println(a/b);
                break;
            default:
                System.out.println("연산자를 잘못 입력하였습니다.");
        }
    }
}
