package test;

import java.util.Scanner;

public class 문제2_2m {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = aaa(a,b);
        System.out.println(c);
    }
    public static int aaa(int a, int b){

        return a*b;
    }
}
