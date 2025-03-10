package test;

import java.util.Arrays;

public class 심화8 {
    public static void main(String[] args) {
        int[] a = {1,3,5,3,4};
        int[] b = {1,1004,6,5};

        int[] c = sum(a,b);
        System.out.println(Arrays.toString(c));
    }
    public static int[] sum(int[]a, int[]b){
        int[] c = new int[a.length+b.length];
        int d =0;
        for (int i = 0; i < a.length; i++){
            c[d++]=a[i];
        }
        for (int i = 0; i < b.length; i++){
            c[d++]=b[i];
        }

        return c;
    }
}
