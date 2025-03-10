package test;

public class 문제2_9 {
    public static void main(String[] args) {
        int sum5 = num(55);
        System.out.println(sum5);
    }
    public static int num(int a){
        int sum = 0;
        for(int i = 1; i<=a; i++){
            if(i%2!=0){
                sum+=i;
                System.out.println(i);
            }
        }
        return sum;
    }
}
