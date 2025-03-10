package test;

import java.util.Scanner;

public class 문제2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  a = sc.nextInt();
        int  b = sc.nextInt();
        dob(a,b);
    }
    public static void dob(int a , int b){
        System.out.println(a*b);
    }
}
