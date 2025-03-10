package test;

import javax.xml.transform.Source;
import java.util.Random;

public class 문제1_19 {
    public static void main(String[] args) {
        Random ran = new Random();

      int[] arr = new int[10];
      int max = arr[0];
      int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
          int a =ran.nextInt(99)+1;
          arr[i] = a;
          min =arr[i];
          System.out.print("["+ arr[i] + "]");

          if (max <arr[i]
          ) {
              max = arr[i];
          }
          if ( min > arr[i]) {
              min = arr[i];
          }

      }
            System.out.println();
          System.out.println("최대값은 : " + max);
          System.out.println("최소값은 : " + min);
    }
}
