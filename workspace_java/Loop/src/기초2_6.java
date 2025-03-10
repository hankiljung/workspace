public class 기초2_6 {
    public static void main(String[] args) {
        int b=0;
        for (int  i =0; i < 100; i++){
            if (i%3 ==0 && i !=0){
                b++;
            }
        }
        System.out.println(b);
    }
}
