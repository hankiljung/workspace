package test;

import java.util.Scanner;

public class 문제1_21myturn {
    public static void main(String[] args) {
        boolean run = true;
        int studentNum = 0;
        int [] scores = null;
        Scanner sc = new Scanner(System.in);

        while (run) {
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("선택 : ");

            int selNum = sc.nextInt();

            switch (selNum){

                case 1 :/* 학생수*/
                    System.out.print("학생 수를 입력하세요");
                    studentNum = sc.nextInt();
                    scores = new int[studentNum];
                    System.out.println("학생 수는 : " + studentNum + "입니다.");
                    break;

                case 2 :/*점수 입력*/
                    if (scores == null) {
                        System.out.println("먼저 학생 수를 설정해야 합니다.");
                    } else {
                        for (int i = 0; i < studentNum; i++) {
                            System.out.print((i + 1) + "번 학생의 점수를 입력하세요 : ");
                            scores[i] = sc.nextInt();
                        }
                        System.out.println("점수 입력이 완료되었습니다.");
                    }
                    break;

                case 3 :/* 점수 리스트*/
                    if (scores == null) {
                        System.out.println("먼저 학생 수와 점수를 설정해야 합니다.");
                    }
                    else {
                        for (int i = 0 ; i<studentNum; i++)
                        System.out.println( (i+1)+ "번 학생의 점수 : " + scores[i]);
                        System.out.println();
                    }
                    break;

                case 4:
                    if (scores == null) {
                        System.out.println("먼저 학생 수와 점수를 설정해야 합니다.");

                    }
                    else {
                        int max=scores[0];
                        double sum=0;
                        for(int i = 0 ; i <scores.length; i++){
                            if(scores[i]>max){
                                max = scores[i];
                            }
                            sum += scores[i];

                        }
                        System.out.println("젤 똑똑한 애 : " + max);
                        System.out.println("평균 : " + sum/studentNum);
                    }
                    break;

                default:
                    if (selNum>5){
                        System.out.println("1~5을 선택하세요.");
                    }
                        break;

                case 5:
                    System.out.println("프로그램을 종료합니다!!");
                    run =false;
            }

        }

    }
}
