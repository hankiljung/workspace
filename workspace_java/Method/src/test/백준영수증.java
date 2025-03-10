package test;

import java.util.Scanner;

public class 백준영수증 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        int n =sc.nextInt();
            int sum = 0;
        for (int i = 0; i <n; i++){
            int a = sc.nextInt();
            int b= sc.nextInt();
            int c = a*b;
            sum+=c;
        }

        if (x == sum){
            System.out.println("yes");
        }
        else {
            System.out.println("No");
        }
    }
}
