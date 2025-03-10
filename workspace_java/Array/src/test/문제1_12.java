package test;

import java.util.Scanner;

public class 문제1_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a ;
        System.out.print("정수를 입력하세요 : ");
        a = sc.nextInt();
        int b;
        double sum = 0;

        b=a;
        int[] arr = new int[b];
        b = arr.length;

//        for(int i =0; i< b; i++){
//            arr[i] = i+1;
//            sum = sum+i;
//        }

        for (int e : arr){
            sum = sum +e;

        }

            System.out.println(sum/arr.length);
    }
}
