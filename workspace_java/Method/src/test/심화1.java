package test;

public class 심화1 {
    public static void main(String[] args) {
    int a = nine(5);
    }

    public static int nine(int a){
        for (int i = 1; i<=9;i++){
            System.out.println(i +"X" + a + "=" + a*i );
        }
        return a;
    }
}
