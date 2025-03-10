public class 문제1_12for {
    public static void main(String[] args) {
        int i=0;
        int sum = 0;
        for(i=1 ; i < 300 ; i++){
            sum += i;

            if (sum>300) {

                break;
            }
        }
        System.out.println("합은 : " + sum);
        System.out.println("마지막에 더해진 값 : " + i);


        /*변수 i는 중괄호 안에서만 사용이 가능하다.*/

    }
}
