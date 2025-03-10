public class 문제1_12 {
    public static void main(String[] args) {
        int sum=0;
        int a=1;
        while(a<300){
            sum += a;
            if(sum>300){
                break;
            }
            a++;
        }
        System.out.println(a);
        System.out.println(sum);
    }
}
