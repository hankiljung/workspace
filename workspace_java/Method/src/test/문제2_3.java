package test;

public class 문제2_3 {
    public static void main(String[] args) {
        max(2000 , 50);
    }
    public static void max(int a, int b){
        int max = a>b ? a : b;
        int min = a<b ? a : b;
        System.out.println(max);
    }
}
