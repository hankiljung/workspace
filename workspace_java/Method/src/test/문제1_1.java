package test;

public class 문제1_1 {
    public static void main(String[] args) {
        even(3);
    }
    public static void even(int a){
        if(a%2==0){
            System.out.println("짝수입니다.");
        }
        else{
            System.out.println("홀수입니다.");
        }
    }
}
