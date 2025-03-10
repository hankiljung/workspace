import java.util.Scanner;

public class 문자열입력받기_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        String name = sc.next();/*문자열을 입력받는 코드*/


        System.out.print("주소를 입력해주세요 : " );
       String addr =  sc.next();

        System.out.println("이름 = " + name);
        System.out.println("주소 = " + addr);






    }
}
