package test;

public class 문제2_5 {
    public static void main(String[] args) {
        grade(10);
    }
    public static void grade(int a){

        while (true){
        if (a<=100&&a>=0){
            break;
        }
        else {
            System.out.println("다시 입력하세요");
        }
        }
        if(a>=90){
            System.out.println("A");
        }
        else if(a>=70){
            System.out.println("B");
        }
        else{
            System.out.println("C");
        }
    }
}
