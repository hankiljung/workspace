import java.util.Scanner;

public class 백준4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        String grade;
        System.out.println("점수를 입력하세요");
        num = sc.nextInt();

        if( num<=100 && num>=90){
            grade = "A";
        }
        else if(num<90 && num>=80){
            grade = "B";
        }
        else if(num<80 && num>=70){
            grade = "C";
        }
        else {
            grade = "다시 공부하세요";
        }

        System.out.println(grade);
    }
}
