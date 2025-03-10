package test;

public class 심화7 {
    public static void main(String[] args) {
        String[] c = {"집에", "가고","싶다"};
        String fuk = ab(c);
        System.out.println(fuk);
    }
    public static String ab(String[] a){
            String result = "";
        for (int i = 0 ; i<a.length; i++){
            result +=a[i];
        }
        return result;
    }
}
