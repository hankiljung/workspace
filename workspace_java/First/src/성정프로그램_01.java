/*키보드로 국어, 영어, 수학 점수를 입력받은 후*/
/*입력받은 국어, 영어, 수학 점수 및 총점, 평균을 출력*/
/*단, 국어, 영어, 수학 점수는  정수만 저장된다고 가정*/


import java.util.Scanner;

public class 성정프로그램_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        /*"수학점수를 입력하세요 :" 출력*/
        System.out.printf("수학점수를 입력하세요 :");
        /*math에 입력받는 값을 저장한다.*/
        int math = sc.nextInt();

        /*"국어점수를 입력하세요 :"를 출력*/
        System.out.printf("국어점수를 입력하세요 :");
        /*국어점수를 입력받아 kor에 저장한다*/
        int kor = sc.nextInt();

        System.out.printf("영어점수를 입력하세요 :");
        int eng = sc.nextInt();


        int sum = (int)(math+kor+eng)/3;
        int sum1 = (math+kor+eng);

        System.out.printf("총점 =" + sum1);
        System.out.printf("평균 =" + sum);
    }
}
