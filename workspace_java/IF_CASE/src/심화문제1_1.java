import java.util.Scanner;

public class 심화문제1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("1정수 ");
        a=sc.nextInt();
        System.out.println("2정수 ");
        b=sc.nextInt();
        System.out.println("3정수 ");
        c=sc.nextInt();

        if(a+b<c){
            System.out.println("삼각형 불가능");
        }
        else if(a+c<b){
            System.out.println("삼각형 불가능");
        }
        else if(c+b<a){
            System.out.println("삼각형 불가능");}

        else if(a==b && b==c && c==a){
            System.out.println("삼각형 가능");

            }
        else if(c+b==a){
            System.out.println("삼각형 가능");
        }
        else if(c+a==b){
            System.out.println("삼각형 가능");
        }
        else if(a+b==c){
            System.out.println("삼각형 가능");
        }

        else {
            System.out.println("삼각형 불가능");
        }

    }
}
