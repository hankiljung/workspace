import java.util.Scanner;

public class 문제1_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("정수 1 입력");
        a= sc.nextInt();
        System.out.println("정수 2 입력");
        b= sc.nextInt();
        System.out.println("정수 3 입력");
        c= sc.nextInt();
        if(a==b && b==c && c==a){
            System.out.println(a+"="+b+"="+c);
        }
        else if(a>=b && b>=c) {
            System.out.println(a+">"+b+">"+c);
        }
        else if(a>=c && c>=b){
            System.out.println(a+">"+c+">"+b);
        }
        else if(b>=a && a>=c){
            System.out.println(b+">"+a+">"+c);
        }
        else if(b>=c && c>=a){
            System.out.println(b+">"+c+">"+a);
        }
        else if(c>=a && a>=b){
            System.out.println(c+">"+a+">"+b);
        }
        else if (c>=b && b>=a){
            System.out.println(c+">"+b+">"+a);
        }

    }
}
