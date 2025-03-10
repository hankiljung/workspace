public class 문제1_2 {
    public static void main(String[] args) {
        int a =0;
        int b = 0;
        while(a<101){
            if(a%5==0 && a!=0){
                b++;
                System.out.print(a + " ");
            }
            a++;
        }
        System.out.println("5의배수는 " + b + " 개입니다.");
    }
}
