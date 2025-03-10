package study;

public class Test2 {
  public static void main(String[] args) {
    int[] arr = new int[6];
    Math.random();

    System.out.println(" 이번 주 로또 번호는");
    System.out.println("-------------------------------");
    for (int i = 0; i<arr.length ; i++){
      arr[i] =(int)(Math.random()*45+1);
      System.out.print(arr[i] + "  " +
          "" +
          "");

    }
    System.out.println();
    System.out.println("-------------------------------");
  }
}
