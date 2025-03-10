package test;

public class 문제1_8 {
    public static void main(String[] args) {
        int[] arr = {1,5,7};
        int sum=0;
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
            sum += arr[i];

        }
            System.out.println("배열의 합은 : " + sum);
    }
}
