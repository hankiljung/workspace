import java.util.Scanner;

public class 삼항연산자 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =3;
        int b;
//        if(a>5){
//            b = 1;
//        }
//
//        else{
//            b=2;
//        }
        /// 삼항 연산자 ///
        b = a > 2 ? 1:2;
        /*물음표 앞부분이 조건문*/
        /*참일때 콜론 앞부분 실행*/
        /*거짓일때 콜론 뒷부분 실행*/
        System.out.println("b는 " + " ' "+ b +" ' " + "입니다.");

        // num이 5이면 "참"출력, 그렇지 않은면 "거짓" 출력
        int num = 5;
        System.out.println( num == 3? "참" : "거짓" );
    }
}