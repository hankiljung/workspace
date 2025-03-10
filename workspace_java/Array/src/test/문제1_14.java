package test;

import java.util.Random;

public class 문제1_14 {
    public static void main(String[] args) {
        Random ran = new Random();
        int a = ran.nextInt(200);
        int[] arr = {1,2,3,4,5};
        int[] arr2 = new int[arr.length];
        System.out.println(a);
        for(int i = 0; i <arr.length; i++){
            arr2[i]=arr[i];
            System.out.print(arr2[i] + " ");


        }
    }
}
