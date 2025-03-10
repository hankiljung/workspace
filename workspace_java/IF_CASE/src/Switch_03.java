import java.util.Scanner;

public class Switch_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;

        System.out.print("점수를 입력하세요 : ");
        a = sc.nextInt();

        switch (a/10) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("동물입니다.");
        }
    }
}
