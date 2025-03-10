import java.util.Scanner;

public class 백준3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short A,B;
        System.out.print("A,B를 입력하세요 : ");
        A = sc.nextShort();
        B = sc.nextShort();

        if(A>B){
            System.out.println(">");
        }
        else if(A<B){
            System.out.println("<");
        }
        else{
            System.out.println("==");
        }


    }
}
