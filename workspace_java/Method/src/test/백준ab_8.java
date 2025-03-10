package test;

import java.util.Scanner;

public class 백준ab_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println( );
        for (int i = 0 ; i < num ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Case #"+(i+1)+" + "+a+" + "+ b + " = " +(a+b));

        }
    }
}
