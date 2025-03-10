import java.util.Scanner;

public class 문제1_8_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i =1;
        int cnt=0;
        int endNum;
        System.out.print("정수를 입력하세요 : ");
        endNum = sc.nextInt();
        while(i < endNum +1){
            if(i%2==0){
                cnt++;
            }
            i++;
        }
        System.out.print("짝수의 갯수는 : " + cnt);

    }
}
