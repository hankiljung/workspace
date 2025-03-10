package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test09Test {
    public static void main(String[] args) {
        List<Test09> list = new ArrayList<>();
        Test09 stu1 = new Test09("한길", 95, 65);
        Test09 stu2 = new Test09("한결", 75, 55);
        Test09 stu3 = new Test09("결길", 85, 45);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        for (Test09 e : list) {
            System.out.println(e);
        }
        System.out.println();

        for (int i = 0 ; i < list.size() ; i++){
            if(list.get(i).getTotal()>150){
                System.out.println("총점 150 이상인애");
                System.out.println(list.get(i));

            }
            double sum =0;
            double div = 0.0;
            for (Test09 e : list ){
                sum += e.getTotal();
            }

            System.out.println(sum/list.size());
        }

        int max_index = 0;
        for (int i = 0 ; i < list.size(); i++){
            if(list.get(i) .getTotal() <  list.get(max_index).getTotal()){
                max_index = i;

            }
        }
        System.out.println(list.get(max_index));
    }
}
