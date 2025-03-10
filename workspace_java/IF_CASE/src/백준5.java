import java.util.Scanner;

public class 백준5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a ; /*연도*/
        System.out.println("연도를 입력하세요");
         a  = sc.nextInt();
        if (a%4==0 && a%100 != 0 || a%400==0) {
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}
