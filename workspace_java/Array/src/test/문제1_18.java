package test;

public class 문제1_18 {
    public static void main(String[] args) {
        int[] arr = {1,5,3,8,2};
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min= arr[i];
            }


        }
            System.out.println("최대값은 : " + max);
            System.out.println("최소값은 : " + min);
    }
}
