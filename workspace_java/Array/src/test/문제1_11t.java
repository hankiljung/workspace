package test;

import java.util.Scanner;

public class 문제1_11t {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[6];
        String[] subjects = {"국어", "영어", "수학","과학", "사회", "총 "};

        for(int i = 0; i <scores.length-1 ; i++){
            while(true) {
                System.out.print(subjects[i]+"점수 입력 : ");
                scores[i] = sc.nextInt();

                if (scores[i]>=0 && scores[i]<=100) {
                scores[scores.length-1] += scores[i];
                    break;
                }

            }
        }

        System.out.println("-------------------------------------------------------------------");
        for (int i = 0; i < scores.length ; i ++){
            System.out.println(subjects[i] +"점수는 : " + scores[i]);
        }

        System.out.println("평균 점수는 : "+ scores[scores.length-1]/(scores.length-1));

        System.out.println("-------------------------------------------------------------------");
    }

    }

