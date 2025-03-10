package test;

import java.util.Arrays;

public class 심화9 {
    public static void main(String[] args) {
    int[] arr = {4,3,45,1,3,58,4,5,6,4,6};
    int[] c = even(arr);
        System.out.println(Arrays.toString(c));
    }
    public static int[] even( int[] a){
        int c = 0;
        for (int i = 0 ; i<a.length ; i++){
          if(i%2==0){
              c++;
          }
        }

        int[] b = new int[c];
        int index= 0 ;

        for (int i = 0; i < a.length; i++) {
            if (i % 2 != 0) {  // 짝수 인덱스만 선택
                b[index++] = a[i];  // 배열에 짝수 인덱스 값 저장
            }
        }

        return b;
    }
}
