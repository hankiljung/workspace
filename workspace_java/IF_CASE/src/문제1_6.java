import java.util.Scanner;

public class 문제1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a ;
        String grade;
        System.out.println("정수를 입력하세요");
        a = sc.nextInt();

        if(90<a && a<=100) {
            grade = "A";
        }
        else if(80<=a && a<=90){
            grade = "B";

        }
        else {
            grade = "C";
        }
        System.out.println("학점은"+ grade +"입니다");
    }
}


