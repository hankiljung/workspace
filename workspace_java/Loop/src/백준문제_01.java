import java.util.Scanner;

public class 백준문제_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int n=sc.nextInt();
        int a = 0;
        for(int i = 0; i<9; i++){
            a=(i+1)*n;

            System.out.println((i+1)+" "+ "*" + n + " = " + a);

        }
    }
}
