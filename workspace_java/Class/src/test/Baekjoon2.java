package test;


import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[a];

        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = i++;
            System.out.println(arr[i]);
        }
    }

}
