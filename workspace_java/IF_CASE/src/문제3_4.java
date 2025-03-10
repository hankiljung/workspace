import java.util.Scanner;

public class 문제3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        String cal;
        System.out.print("1수 입력");
        num1 = sc.nextInt();
        System.out.print("2수 입력");
        num2 = sc.nextInt();
        System.out.print("연산자입력");
        cal = sc.next();

        switch (cal){
            case"+":
                System.out.println(num1 + " " +cal + " " + num2 + " = " + (num1+num2) );
                break;
            case"-":
                System.out.println(num1 + " " +cal + " " + num2 + " = " + (num1-num2));
                break;
            case"*":
                System.out.println(num1 + " " +cal + " " + num2 + " = " + (num1*num2));
                break;
            case"/":
                System.out.println(num1 + " " +cal + " " + num2 + " = " + (num1/num2));
                break;
            default:
                System.out.println("연산자를 다시 입력하세요");


        }

    }
}
