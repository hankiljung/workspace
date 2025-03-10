import java.util.Scanner;

public class 문제1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = 0;
        int a;
        int c = 0;
        while(c<5){

        a = sc.nextInt();
            if (a%2==0){
                b++;
            }
            c++;

        }
        System.out.println(b);
    }
}
