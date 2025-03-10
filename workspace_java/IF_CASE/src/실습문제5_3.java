import java.util.Scanner;

public class 실습문제5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a;
        int b,c;
        System.out.print("1수");
        b=sc.nextInt();
        System.out.print("2수");
        c=sc.nextInt();
        System.out.print("연산자");
        a=sc.next();

        if(a.contains("+")){
            System.out.println(b+c);
        }
        else if(a.contains("-")){
            System.out.println(b-c);
        }
        else if(a.contains("*")){
            System.out.println(b*c);
        }
        else if(a.contains("/")){
            System.out.println(b/c);
        }

        else {
            System.out.println("연산자를 잘못 입력했습니다.");
        }

    }
}
