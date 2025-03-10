public class Whilte_04 {
    public static void main(String[] args) {
        //2부터 2,4,6,8,10을 출력
        int a = 2;
//        while(a < 11){ /*조건이 참이어야 한다.*/
//            System.out.println(a);
//            a = a+2;
//        }
        while(a<11){
            if(a%2 == 0){
                System.out.println(a);
            }
            a++;
        }
    }
}
