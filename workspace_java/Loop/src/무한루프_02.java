import java.util.Scanner;

public class 무한루프_02 {
    public static void main(String[] args) {
        /*무한루프는 언제 사용할까?*/
        /*반복 횟수가 정해져 있지 않을때 사용*/
        Scanner sc = new Scanner(System.in);
        int score;
        //0~100점 사이의 점수를 입력할때 동안 계속 입력시킨다.
        while (true){
            System.out.print("국어 점수 입력(0~100)");
            score = sc.nextInt();
            if(score>=0 && score<=100){
                break;

            }

        }

    }

}