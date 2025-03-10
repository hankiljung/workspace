package study;

/*배열이 자료형이란느 의미*/
public class Array_04 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int a =5;

        a = arr1[1];

        String[] arr2 = {"java", "house"};
        int[] arr3 = {1,5};
        int[] arr6 = {2,6,3,5,35};
        String[] arr4 = {"abc"};
        arr2[0] = arr4[0];
        System.out.println(arr2[0]);
        arr2=arr4;
        arr3= arr6;

    }
}
