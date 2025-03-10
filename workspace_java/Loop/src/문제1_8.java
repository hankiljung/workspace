import java.util.Scanner;

public class 문제1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("정수 입력 : ");
        a=sc.nextInt();
        int num=0;
        while(a>0){
            a--;
            if(a%2==0 && a!=0){
                num++;
            }
        }
        System.out.print("짝수의 갯수는 : " + num);
    }
}
