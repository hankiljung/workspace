package study;

import java.util.Scanner;

public class Test4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int a = num / 100; //백의 자리 수
    int b = (num / 10) % 10; //십의 자리 수
    int c = num % 10; //일의 자리수
    int cnt = 0;

    if (num < 10) {
      if (c % 3 == 0&&c!=0)
        cnt++;
    }

    if (num >= 10 && num < 100) {
      if (b % 3 == 0&&b!=0)
        cnt++;
      if (c % 3 == 0&&c!=0)
        cnt++;
    }

    if (num > 100) {
      if (a % 3 == 0)
        cnt++;
      if (b % 3 == 0&&b!=0)
        cnt++;
      if (c % 3 == 0&&c!=0)
        cnt++;
    }

    switch (cnt) {
      case 0:
        System.out.println("노박수");
        break;
      case 1:
        System.out.println("1박수");
        break;
      case 2:
        System.out.println("2박수");
        break;
      case 3:
        System.out.println("3박수");
        break;

    }


  }
}
