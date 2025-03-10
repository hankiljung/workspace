package test;

public class 문제1_3 {
    public static void main(String[] args) {
        sum0(5);
    }
    public static void sum0(int a){
        int sum= 0;
        for(int i = 0; i <= a; i++){
            sum +=i;
        }
            System.out.println(sum);
    }
}
