package test;

public class 문제1_20 {
    public static void main(String[] args) {
        int[] arr = new int[99];
        for(int i = 0; i<arr.length; i++){
            arr[i]=i+1;
            if((arr[i]%10)%3==0 && (arr[i]/10)%3==0 && arr[i]/10!=0){
                System.out.println(arr[i]+ "박수 두번");

            }
            if((arr[i]%10)%3==0 && arr[i]%10!=0) {
                System.out.println(arr[i] + "박수 한번");

            }
        }
    }
}
