package test;

public class 심화2 {
    public static void main(String[] args) {
    ab(50);
    }
public static void ab(int a){
        for (int i = 1; i<=100; i++){
            if(i%a == 0){
                System.out.println(i);
            }
        }
}
}

