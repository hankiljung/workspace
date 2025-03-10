package test;

public class 문제1_4 {
    public static void main(String[] args) {
        bet(2,10);
    }
    public static void bet(int a, int b ){
        int max=0;
        int min=0;
        if(a>b){
            max=a; min=b;
        }
        else{
            min=a; max=b;
        }
        System.out.println(min);
        System.out.println(max);

            System.out.print("두 수 사이에 정수는 : " );
            System.out.print(" [ " );

        for(int i = min+1; i<max; i++){
            System.out.print(i + " ");
        }
            System.out.print(" ]" );
    }
}

