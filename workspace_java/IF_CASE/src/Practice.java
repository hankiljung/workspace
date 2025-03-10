import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

            System.out.print("정수를 입력하세요 : ");
            a = sc.nextInt();
        while (true) {
            if (a>=100 || a<=0) {
                System.out.println("다시입력");
            }
        }

    }
}
