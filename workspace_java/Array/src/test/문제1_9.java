package test;

import java.util.Scanner;

public class 문제1_9 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);


        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        arr[3] = sc.nextInt();
        arr[4] = sc.nextInt();

        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");

        }

    }
}
