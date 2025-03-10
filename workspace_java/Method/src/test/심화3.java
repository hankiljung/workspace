package test;

public class 심화3 {
    public static void main(String[] args) {
        int a = ran();
        System.out.println(a);
    }
    public static int ran(){
        int a = (int)(Math.random()*50+1);
        return a;
    }
}
