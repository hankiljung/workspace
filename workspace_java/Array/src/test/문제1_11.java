package test;

import java.util.Scanner;

public class 문제1_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[4];//0:국, 1:수, 2:영, 4:총

        System.out.print("국어점수 입력");
        score[0] = sc.nextInt();/*국어*/
        System.out.print("수학점수 입력");
        score[1] = sc.nextInt();/*수학*/
        System.out.print("영어점수 입력");
        score[2] = sc.nextInt();/*영어*/
        score[3] = score[1]+score[2]+score[0];
        double a = (score[1]+score[2]+score[0])/3 ;

        System.out.println("국어점수 : " + score[0]);
        System.out.println("수학점수 : " + score[1]);
        System.out.println("국어점수 : " + score[2]);
        System.out.println("총점점수 : " + score[3]);
        System.out.println("평균  : " + a);




    }
}
