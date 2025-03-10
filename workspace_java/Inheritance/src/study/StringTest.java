package study;

public class StringTest {
  public static void main(String[] args) {
    String s1 = "Simple";
    String s2 = "Java";

    String s3 = s1.concat(s2);
    // concat : 두 문자열을 나열한 결과를 리턴한다.
    int a = s3.length();
    // length : 문자열의 길이를 정수로 리턴해준다.
    String result = String.valueOf(3.5);
    //String.valueOf(); : 매개변수로 전달된 데이터를 문자열로 바꿔서 리턴

    String data = "hi java";
    String d = data.substring(0,2);
    // substring은 앞에껀 포함 뒤에껀 인덱스 전까지임..

    String data2 = "a,b,c";
    String[] arr = data2.split(",");

    for(int i = 0; i<arr.length; i++){
      System.out.print(arr[i]);
    }

    System.out.println();
    System.out.println();
    System.out.println(d);
    System.out.println(result);
    System.out.println(a);
    System.out.println(s3);

  }
}
