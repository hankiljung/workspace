package test;

public class 문제1_2 {
    public static void main(String[] args) {
        evenOdd(3,2);
    }

    public static void evenOdd(int a, int b){
        if(a%2==0 && b%2==0){
            System.out.println("두 수는 짝수입니다.");
        }
        else if(a%2==0||b%2==0){
            System.out.println("한 수만 짝수입니다.");

        }
        else {
            System.out.println(" 두 수는 홀 수 있비나.");
        }
    }
}
