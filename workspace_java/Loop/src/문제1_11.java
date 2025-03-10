import java.util.Scanner;

public class 문제1_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a ;
        int b;

        a=sc.nextInt();
        b=sc.nextInt();

//        int max = a>b? a: b;
//        int min = b>a?  a : b;
        int max, min;
        if(a>b){
            max = a;
            min = b;
        }
        else{
            max= b;
            min = a;
        }

        int i = min+1;
        int sum = 0;

        while (i < max) {
            sum += i;
            i++;
        }

        System.out.println(sum);

    }
}
