package test;

import java.util.ArrayList;
import java.util.List;

public class Test05Test {
    public static void main(String[] args) {
        List<Test05> list = new ArrayList<>();
        Test05 t1 = new Test05("hankil1",  "비범3", "정한길", 25);
        Test05 t2 = new Test05("hankil2",  "비범1", "정ruf", 26);
        Test05 t3 = new Test05("hankil3",  "비범2", "정한길", 13);

        list.add(t1);
        list.add(t2);
        list.add(t3);

        for (Test05 e : list){
            System.out.println(e);

        }
        int ageSum = 0 ;
        for (Test05 e : list){
            ageSum += e.getAge();
        }
        System.out.println(ageSum);

       for (int i =0; i<list.size() ; i++){
           if(list.get(i).getId().equals("hankil1")){
               list.remove(i);
           }
               System.out.println(list.get(i));
           System.out.println(list.size());

       }

    }
}
