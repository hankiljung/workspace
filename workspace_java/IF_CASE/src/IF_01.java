//조건문 if
/*조건이 맞을때만 코드를 실행하는 문법*/

/*if(참, 거짓){
*   실행코드....
*   실행코드
* }
*  */


public class IF_01 {
    public static void main(String[] args) {
        System.out.println("시작");

        int num = 3;
        if(num == 3){
            System.out.println("XOX");
            System.out.println("OXO");
            System.out.println("XOX");
            /*참이면 if문 안의 내용을 실행한다.*/
        }

        /*조건에 따른 실행코드가 하나라면 중괄호 생략 가능*/
        if(num <1)
            System.out.println("BBB");

        System.out.println("BBB");
        System.out.println("끝");
    }
}
