package test;

public class 문제2_4 {
    public static void main(String[] args) {
        nar(20000,313);
    }
    public static void nar(int a, int b){
        int max = a>b ? a : b;
        int min = a<b ? a :b;
        System.out.println(min + "  " + max);

    }
}
