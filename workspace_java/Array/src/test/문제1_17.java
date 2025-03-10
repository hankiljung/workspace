package test;

import java.util.Random;

public class 문제1_17 {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] arr = new int[6];

        for(int i = 0; i<arr.length; i++) {
            int ranNum = ran.nextInt(44)+1;
            arr[i] = ranNum;

            System.out.print(arr[i] + " ");

        }

    }
}
