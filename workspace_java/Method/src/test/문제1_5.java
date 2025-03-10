package test;

public class 문제1_5 {
    public static void main(String[] args) {
      oddfit(20,10);
    }
    public static void oddfit(int a, int b){
        int max, min;
        int cnt=0;
        if(a>b){
            max=a; min=b;
        }
        else {
            min=a; max=b;
        }
        for(int i = min+1; i<max; i++){
            if(i%5==0){
                cnt++;
                System.out.println(i);
            }
        }
        System.out.println(cnt);
    }
}
