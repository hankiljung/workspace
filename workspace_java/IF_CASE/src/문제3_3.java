import java.util.Scanner;

public class 문제3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        String c;
        System.out.print("1수");
        a = sc.nextInt();
        System.out.print("2수");
        b = sc.nextInt();
        System.out.print("연사자를 입력하세요");
        c = sc.next();

        if (c.contains("+")){
            System.out.println(a+b);
        }
        else if (c.contains("-")){
            System.out.println(a-b);
        }
        else if (c.contains("*")){
            System.out.println(a*b);
        }
        else if (c.contains("/")){
            System.out.println(a+b);
        }
        else {
            System.out.print("다시 입력하세요");
        }


    }
}
