import java.util.Scanner;

public class 문제3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a ;
        System.out.print("성별을 입력하세요");
        a = sc.next();

        if(a.contains("남")){
            System.out.print("남자입니다.");
        }
        else if(a.contains("여")){
            System.out.print("여자입니다.");

        }
        else{
            System.out.println("다시입력하세요.");
        }


    }
}
