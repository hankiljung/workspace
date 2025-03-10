public class Test2 {
  public static void main(String[] args) {
  int[] lotto = new int[6];

  for (int i = 0; i<lotto.length; i++){
    int number = ((int)(Math.random()*45)+1);
    lotto[i] = number;
    System.out.println((i+1)+"번째 번호 = " + lotto[i]);
  }




  }
}
