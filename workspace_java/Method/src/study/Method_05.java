package study;

import java.util.Scanner;

/// 메서드의 리턴타입
// 메서드의 실행결과 리턴되는 데이터의 자료형
// 리턴은 메서드를 호출하는 곳에 결과값을 되돌려준다.
// 리턴되는 데이터의 자료형과 메서드의 리턴타입은 일치시켜야함!!
// 리턴 명령어는 실제 데이터를 리턴하는 역할을 합니다.
// 리턴 명령어 뒤에는 어떠한 코드도 올 수 없다.
// 메서드에서 리턴 명령어는 한번만 실행할 수 있다.

public class Method_05 {
    public static void main(String[] args) {
        int sum = bbb(3,50);
        System.out.println(sum);
        int c = ccc();
        System.out.println(c);
    }

        /// return 명령어를 한 번만 실행할 수 있다는 의미
    public static int ccc(){
        //두 수중 큰 수를 리턴
        int a = 5;
        int b = 19;
        int[] arr = new int[3];

        return Math.max(b,a);
    }


    public static int bbb(int a , int b){

        return a+b;
    }
}


