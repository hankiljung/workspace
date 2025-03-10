package study;

public class Method_06 {
    public static void main(String[] args) {
    String a = aaa(3);
        System.out.println(a);
    }
    //매개변수로 정수 하나를 전달받아서 전달받은 정수가 짝수라면
    //짝수면 짝 출 홀수면 홀 출
    
    public static String aaa(int b){
         String result = "";
        if (b%2==0){
        result = "짝수입니다.";

        }
        else {
            result = "홀수입니다.";
        }
        return result;
    }
}
