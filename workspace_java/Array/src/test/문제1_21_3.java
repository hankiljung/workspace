package test;

import java.util.Scanner;

public class 문제1_21_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int[] score = null;
        int stuNum = 0;

        while(run) {
            System.out.println("----------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("----------------------------------------------------");
            System.out.print("선택 : ");

            int selNum = sc.nextInt();

            switch (selNum){

                case 1 :/*학생수 설정*/
                    System.out.print("학생수를 입력하세요 : ");
                    stuNum = sc.nextInt();
                    score = new int[stuNum];
                    System.out.println("학생은 총 " +stuNum + "명입니다.");
                    break;

                case 2: /*점수 입력*/
                    if(score==null){
                        System.out.println("학생 수를 입력하세요.");
                    }
                    else {
                        for (int i = 0; i<stuNum; i++){
                            System.out.println((i+1) + "번 학생 점수");
                            score[i]=sc.nextInt();
                        }
                    }
                    break;

                case 3 :/*점수 리스트*/
                    if(score==null){
                        System.out.println("학생수와 점수를 입력하세요.");
                    }
                    else {
                        for (int i = 0 ; i < stuNum; i++)
                            System.out.println((i+1) + "번 학생점수 : " + score[i]);
                    }
                    break;
                case 4:
                    int max=score[0];
                    double sum=0;
                    for (int i = 0; i < stuNum; i++){
                        if(score[i]>max){
                            max=score[i];
                        }
                        sum += score[i];
                    }
                    System.out.println("젤 똑똑한 애 : " + max);
                    System.out.println("평균 : " + sum/stuNum);
                    break;
                default:
                    if(selNum>5){
                        System.out.println("1~5번을 선택해주세요.");

                    }
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    run = false;
                    

            }




        }
    }
}
