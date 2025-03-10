package test;

import java.util.Random;

public class 문제1_17_02 {
    public static void main(String[] args) {
        Random ran =new Random();
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++){
            int a = ran.nextInt(45);
            arr[i] = a;
        }

        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);

        }
    }
}
