import java.util.Scanner;

public class 심화문제1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.print("점 x,y를 입력하시요 >> ");
        x = sc.nextInt(); y = sc.nextInt();


        if (x<=100 && 50<=x && y<=100 && 50<=y){
            System.out.println("사각형 안에 점이 있습니다");
        }
        else {
            System.out.println("사각형 안에 점이 없습니다");
        }
    }
}

