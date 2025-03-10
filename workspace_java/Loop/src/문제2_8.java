import java.util.Scanner;

public class 문제2_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt=0;
        int a;
        for(int i = 0; i < 5 ; i++ ){
            a=sc.nextInt();
            if(a%2==0 && a!=0){
                cnt++;
            }
        }
        System.out.println("짝수의 갯수는 : " + cnt);
    }
}
