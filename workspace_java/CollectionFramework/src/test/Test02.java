package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>(   );
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());

        int sum = 0;

        for (int e : list){
            sum += e;
        }
        System.out.println(sum);

    }
}
