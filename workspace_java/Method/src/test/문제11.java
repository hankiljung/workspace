package test;

public class 문제11 {
    public static void main(String[] args){
    int[] a= {1};
    int[] b = {3};
    aaa(a,b);
        System.out.println(a[0]);
        System.out.println(b[0]);

    }
    public static void aaa( int[] aa , int[] bb){
        int[] c ;
        c = aa;
        aa = bb;
        bb = c;

    }
}
