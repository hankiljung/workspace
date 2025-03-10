import java.util.Scanner;

public class 성적프로그램2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int korScore;
        int engScore;
        int mathScore;
        int totalScore;
        double avg;


        System.out.printf("국어점수를 입력하세요 :");
        korScore = sc.nextInt();

        System.out.printf("영어점수를 입력하세요 :");
        engScore= sc.nextInt();

        System.out.printf("수학점수를 입력하세요 :");
        mathScore = sc.nextInt();

        totalScore = mathScore+korScore+engScore;
        avg= totalScore/3.0;

        /*정수끼리의 연산결과는 무조건 정수로 나옴*/
        System.out.printf("국어점수 : " + korScore);
        System.out.printf("영어점수 : " + engScore);
        System.out.printf("수학점수 : " + mathScore);
        System.out.printf("총점 : " + totalScore);
        System.out.printf("평균 : " + avg);
    }
}
