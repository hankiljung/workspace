package study;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] arr = new int[3];
    System.out.print("정수 1 :");
    arr[0] = sc.nextInt();
    System.out.print("정수 2 :");
    arr[1]= sc.nextInt();
    System.out.print("정수 3 :");
    arr[2] = sc.nextInt();
    int max = 0;

    for(int i = 0 ; i < arr.length ; i++){
      if(arr[i]>max){
        max = arr[i];
      }

    }

      System.out.println(max);

  }
}
