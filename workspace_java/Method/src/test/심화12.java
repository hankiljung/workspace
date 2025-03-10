package test;
import java.util.Arrays;
public class 심화12 {
    public static void main(String[] args) {
        int[] arr = {35, 4, 456, 8456, 1564765, 489, 78, 456, 132478, 5135};
        ng(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void ng(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
