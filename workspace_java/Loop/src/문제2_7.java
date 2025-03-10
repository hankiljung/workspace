public class 문제2_7 {
    public static void main(String[] args) {
        int b=0;
        for (int i = 0; i <100; i++){
            if(i%5==0 && i!=0){
                b++;
                System.out.print(i +" ");
            }
        }
        System.out.println("5의 배수의 개수 : " + b);
    }
}
