package test;

public class 문제1_15 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int  a=0;

        int[] arr3 = new int[arr1.length+arr2.length];

        for (int i=0 ; i<arr1.length; i++){
            arr3[a++] = arr1[i];
        }
        for (int i=0; i <arr2.length; i++){
            arr3[a++] = arr2[i];
        }

        for(int e : arr3) {
            System.out.print(e + " ");
        }
    }
}
