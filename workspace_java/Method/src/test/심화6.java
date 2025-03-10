package test;

public class 심화6 {
    public static void main(String[] args) {
        int[] arr = {6,50,41,51,4135,121235};
        int max = max(arr);
        System.out.println(max);
    }
    public static int max(int[] a){
            int max = a[0];
        for(int i = 0 ; i< a.length ; i++){
            if (a[i]>max){
                max = a[i];
            }
        }
        return max;
    }
}
