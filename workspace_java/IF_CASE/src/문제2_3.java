import java.util.Scanner;

public class 문제2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int clapCnt = 0;

        System.out.print("1~99 사이의 정수를 입력하세요 : ");
        num = sc.nextInt();
        int tens = num/10;
        int ones = num%10;

        if(tens == 3 || tens == 6 || tens ==9){
            ++clapCnt;
        }
        if(ones==3 || ones ==6 || ones == 9){
            ++clapCnt;
        }
        switch (clapCnt){
            case 0:
                System.out.println("박수 없음");
                break;
            case 1:
                System.out.println("박수 짝");
                break;
            case 2:
                System.out.println("박수 짝짝");
        }

        }


}
