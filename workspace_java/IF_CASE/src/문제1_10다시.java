import java.util.Scanner;

public class 문제1_10다시 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        int min, mid, max;
        System.out.print("1번수");
        a=sc.nextInt();
        System.out.print("2번수");
        b=sc.nextInt();
        System.out.print("3번수");
        c=sc.nextInt();

        if (a>b && a>c){
            max = a;
            if (b>c){
                mid = b; min=c;
            }
            else {
                mid =c; min=b;
            }
        }

        else if (b>a && b>c) {
            max = b;
            if (a>c){
                mid =a; min = c;
            }
            else {
                mid =c; min=a;
            }
        }

        else {
            max = c;
            if (b>a){
                mid = b; min=a;
            }
            else {
                mid=a; min=b;
            }
        }
        System.out.println(max + ">" + mid + ">" + min);


    }
}
