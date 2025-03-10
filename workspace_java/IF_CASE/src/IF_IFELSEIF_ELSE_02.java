import java.util.Scanner;

public class IF_IFELSEIF_ELSE_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =5 ;
        /*파일명과 클래스명이 같아야 오류가 안난다.*/
        if(a >= 5){
            System.out.println("1");
        }
        /*별도의 조건문임*/
        if(a==5) {
            System.out.println("2");
        }
        /*둘다 실행이된다.*/
        else {
            System.out.println("3");
        }
    }
}
