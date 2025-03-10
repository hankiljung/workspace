package test;

public class 문제2_5m {
    public static void main(String[] args) {
    String c  = a(30);
        System.out.println(c);
    }

    public static String a( int a){
        while (true){
            if(a<=100&& a >=0){
                break;
            }
            else {
                System.out.println("다시입력하세요");
            }
        }

            if (a>=90){
                return "A";
            }
            else if  (a>=70){
                return "B";

            }
            else {
                return "C";
            }
    }
}
