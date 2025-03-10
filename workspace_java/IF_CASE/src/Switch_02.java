import java.util.Scanner;

public class Switch_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.print("성별을 입력하세요 : ");
        a= sc.next();

        switch (a){
            case "남" :
                System.out.println("남자입니다.");
                break;
            case "여" :
                System.out.println("여자입니다.");
                break;
            default:
                System.out.println("동물입니다.");
        }
    }
}
