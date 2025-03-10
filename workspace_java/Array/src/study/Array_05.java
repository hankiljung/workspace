package study;

/*배열 자료형과 기존 자료형의 차이점*/
///  참조 자료형과 기본 자료형의 차이점
///
public class Array_05 {
    public static void main(String[] args) {
        /// 기본 자료형 예시
        int a =10;
        int b = 20;
        int[] arr = new int[3];
        a = b;
        b=30;
        System.out.println("a = " + a); // 20
        System.out.println("b = " + b); //30


        /// 배열(참조자료형) 예시
        int[] arr1 = new int[3];
        arr1[0]= 10;
        arr1[1]= 30;
        arr1[2]= 40;
        int[] arr2 = new int[1];
        arr2[0] = 20;

        arr1[0] = arr2[0];
        arr2[0] = 80;

        System.out.println("arr1[0] = " + arr1[0]); //20
        System.out.println("arr1[1] = " + arr1[1]); //20
        System.out.println("arr1[2] = " + arr1[2]); //20
        System.out.println("arr2[0] = " + arr2[0]); //30


    }
}
