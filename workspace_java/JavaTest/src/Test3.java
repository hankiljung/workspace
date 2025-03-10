import java.util.Scanner;

public class Test3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    //박수 칠 횟수
    int cnt=0;

    //백의 자리수
    int baek = num/100;
    //십의 자리수
    int sip = (num/10)%10;
    //일의 자리수
    int ill = num%10;


      if(num <10) {
        if (ill%3 == 0 &&ill!=0)
          cnt++;
      }

      if(num>10&&num<100){
        if(ill%3==0&&ill!=0)
          cnt++;
        if(sip%3==0&&sip!=0)
          cnt++;
      }

      if(num>100){
        if(ill%3==0&&ill!=0)
          cnt++;
        if(sip%3==0&&sip!=0)
          cnt++;
        if(baek%3==0&&baek!=0)
          cnt++;
      }

    switch(cnt) {
      case 0:
        System.out.println("박수 없음");
        break;
      case 1:
        System.out.println("박수 1번");
        break;
      case 2:
        System.out.println("박수 2번");
        break;
      case 3:
        System.out.println("박수 3번");
    }


  }

}
