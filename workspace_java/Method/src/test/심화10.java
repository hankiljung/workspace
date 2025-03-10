package test;

public class 심화10 {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        df(a,b);
        System.out.println(a);
        System.out.println(b);
    }
    public static void df(int num1, int num2){
        int c ;
        c=num1;
        num1=num2;
        num2=c;
    }
}
