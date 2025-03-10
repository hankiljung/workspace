public class 문제1_1 {
    public static void main(String[] args) {
        int a =0;
        int b = 0;
        while(a<101){
            if(a%3==0 && a != 0){
                b++;
                System.out.println(a);
            }
            a++;
        }
        System.out.println("3의 배수는 " + b + "개 입니다.");
    }
}
