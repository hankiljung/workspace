import java.util.Scanner;

public class Test1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("숫자1 입력하세요.:");
    int x1 =sc.nextInt();
    System.out.print("숫자2 입력하세요.:");
    int y1 = sc.nextInt();
    System.out.print("숫자3 입력하세요.:");
    int z1 = sc.nextInt();

    int max;
    int mid;
    int min;

    if (x1 > y1 && y1 > z1) {
      max = x1;
    } else if (y1 > x1 && y1 > z1 && (y1 > z1 || z1 > y1)) {
      max = y1;
    } else {
      max = z1;
    }

    if ((x1 < y1 && x1 > z1) || (x1 > y1 && x1 < z1)) {
      mid = x1;
    } else if ((y1 < x1 && y1 > z1) || (y1 > x1 && y1 < z1)) {
      mid = y1;
    } else {
      mid = z1;
    }

    if (x1 < y1 && x1 < z1 && (y1 < z1 || z1 < y1)) {
      min = x1;
    } else if (y1 < x1 && y1 < z1 && (x1 < z1 || z1 < x1)) {
      min = y1;
    } else {
      min = z1;
    }
    System.out.printf("가장큰수 = " + max +"  중간수 = "+mid+"  작은수 = "+min);
  }
}
