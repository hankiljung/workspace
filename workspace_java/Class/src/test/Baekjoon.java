package test;

import java.util.Scanner;

public class Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i]=sc.nextInt();
        }
        int cnt = 0;
        int x = sc.nextInt();
        for (int i = 0 ; i < n ; i ++){
            if(arr[i]==x){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
