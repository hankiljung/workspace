package test;

import java.util.Arrays;

public class 심화9_t {
    public static int[] test9(int[] arr){
        int[] arr2 = new int[arr.length/2];
        int a = 0;

        for(int i = 0; i< arr.length ; i ++){
            if(i%2!=0){
                arr2[a++] = arr[i];
            }
        }

        return arr2;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] arr2 = test9(arr);
        System.out.println(Arrays.toString(arr2));
    }
}
