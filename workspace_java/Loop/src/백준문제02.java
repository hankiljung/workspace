import java.util.Scanner;

public class 백준문제02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n을 입력해라 :");
        int n = sc.nextInt();
        int sum = 1;
        for (int i = 0; i<n; i++){
            sum+=i;

        }
            System.out.println(sum);


    }
}
