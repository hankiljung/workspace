import java.util.Scanner;

public class 문제2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xPos,yPos;
        System.out.print("점 (x,y) 값을 입력하세요 : ");
        xPos = sc.nextInt();
        yPos = sc.nextInt();

        if(50<=xPos && xPos<=100 && 50<=yPos && yPos<=100){
            System.out.println("사각형 안에 점이 있습니다.");

        }
    }
}
