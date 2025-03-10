package test;
import java.util.Arrays;

public class 심화93 {
    public static void main(String[] args) {
        int[] arr = {3,2,5,4,63,4,6,5,2,1,5,4,2,3,4,24,24,3,5,1,2,4,3,5,7,4,6,8,2,7,6,30};
        int[] arr2 = even(arr);
        System.out.println(Arrays.toString(arr2));
    }
    public static int[] even(int[] arr){
        int evenCnt = 0;

        for(int i = 0 ; i<arr.length; i++){
        if(arr[i]%2==0){
            evenCnt++;
            }
        }

        int[] evenArr = new int[evenCnt];
        int even = 0;
        for (int i = 0 ; i<arr.length; i++){
            if(arr[i]%2==0){
                evenArr[even++] = arr[i];
            }
        }

        for(int i = 0; i<evenArr.length; i++){
                int temp = evenArr[0];
            for (int j = 0; j<evenArr.length-i-1; j++){
                if(evenArr[j]>evenArr[j+1]){
                    temp = evenArr[j];
                    evenArr[j]=evenArr[j+1];
                    evenArr[j+1]=temp;
                }
            }
        }

        return evenArr;
    }
}
