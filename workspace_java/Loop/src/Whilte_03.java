public class Whilte_03 {
    public static void main(String[] args) {
        //7부터 1까지 출력
        int a = 7;
        while( a > 0 ){
            System.out.println(a);
            --a;
        }
        double b = 10;
        while(b >= 0.001){
            System.out.println(b);
            b = b/10;
        }
        System.out.println(b);
    }
}
