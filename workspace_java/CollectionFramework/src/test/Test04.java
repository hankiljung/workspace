package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test04 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random ran = new Random();
        list.add(ran.nextInt(100));
        list.add(ran.nextInt(100));
        list.add(ran.nextInt(100));
        list.add(ran.nextInt(100));
        list.add(ran.nextInt(100));
        list.add(ran.nextInt(100));
        list.add(ran.nextInt(100));
        list.add(ran.nextInt(100));
        list.add(ran.nextInt(100));
        list.add(ran.nextInt(100));
        list.add(ran.nextInt(100));

        for (int e : list){
            if(e%2==0){
                System.out.println(e);
            }

        }



    }
}
