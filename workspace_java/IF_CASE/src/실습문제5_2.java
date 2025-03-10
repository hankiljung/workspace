import java.util.Scanner;

public class 실습문제5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.print("성별 입력 ㄱㄱ : ");
        a = sc.next();
        if(a.contains("남")){
            System.out.println("남자입니다");
        }
        else if(a.contains("여")){
            System.out.println("여자입니다.");
        }
    }
}
