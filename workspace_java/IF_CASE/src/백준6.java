import java.util.Scanner;

public class 백준6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.println("x,y를 입력하세요 : ");
        x=sc.nextInt();
        y=sc.nextInt();

        if (x<0 && y<0){
            System.out.println("D3");
        }
        else if(x>0 && y<0){
            System.out.println("D4");

        }
        else if(x<0 && y>0){
            System.out.println("D2");
        }
        else {
            System.out.println("D1");
        }
    }
}
