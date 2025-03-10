import java.util.Random;
import java.util.Scanner;

public class Test5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random ran = new Random();

    int[] zone = new int[3];

    for(int i = 0; i< zone.length; i++){
        zone[i] = ran.nextInt(9)+1;
        for(int j = 0; j < i ; j++ ){
          if(zone[i]==zone[j]){
            i--;
            break;
          }
        }
    }

    for(int i = 0; i< zone.length; i++){
      System.out.println(zone[i]);
    }




    int tryCnt = 1;

    //와일문에서 게임을 계속 실행시킬 불린문
    boolean game = true;


    while (game){

      int stCnt =0; /// 스트라이크 카운트
      int ballCnt = 0; /// 볼 카운트

      int[] shot = new int[3]; //던질 공의 3수를 받을 것

      System.out.println("1~9까지 3수를 입력하세요.");
      for(int i = 0; i <shot.length; i ++){
          shot[i] = sc.nextInt();

        if(i>0&& shot[i-1]==shot[i]){
          System.out.println("수를 다시입력하세요");
          i--;
        }
      }

      for(int i = 0; i< zone.length; i++){
         for(int j =0; j<shot.length; j++){
           if(shot[i]==zone[j]){
             if(i==j)
               stCnt++;
             else
               ballCnt++;
           }
         }

      }

      System.out.println(stCnt + "스트라이크" + ballCnt +"볼");
      if(stCnt==3){
        System.out.println(tryCnt + "회만에 정답을 맞췄습니다.");
      break;
      }

      tryCnt++;  //시도 실패시 트라이카운트++
    }



    }
  }

