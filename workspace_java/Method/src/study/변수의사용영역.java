package study;
/*변수는 사용 가능한(인식 가능한)범위가 존재한다.*/
/*변수의 사용 영역은 해당 변수가 선언된 중괄호 안에서만 가능하다.*/

public class 변수의사용영역 {
    public static int a(){
        return 4;
    }

    public static void main(String[] args) {

        int data = 1;
        int a = 5;
        if(a>3){

            int b = 10;
        System.out.println(b);
        }
        System.out.println(a);
        int 숫자 = 3;
        System.out.println(숫자);
        int b =4;
        System.out.println(b);
        String 문자 ;
        문자 = "문자";
        System.out.println(문자);
        int num2;
        if(10>5){
            num2 = 5 ;
        }
        if (3>1){
            num2 = 10;
        }
        for(int i = 0; i <10; i++){
            System.out.print(i);
        }
        System.out.println();
        for(int i = 0 ; i < 10; i++){
            System.out.println("data = "+ data);
            ++data;
        }
        System.out.println(data);
        /*반복문 안에서 변수를 선언하면 계속 다시 선언된다.*/
    }
}
