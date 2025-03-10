package test;

public class 문제2_10 {
    public static void main(String[] args) {
    boolean a = even("안녕하세요");
        System.out.println(a);
    }

    public static boolean even(String a){
        return a.length() % 2 == 0;

        }

}