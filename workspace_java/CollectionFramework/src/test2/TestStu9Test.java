package test2;

import java.util.ArrayList;
import java.util.List;

public class TestStu9Test {
    public static void main(String[] args) {
        List<TestStu9> stuList = new ArrayList<>();
        TestStu9 stu1 = new TestStu9("김뜨또", 80, 95,50);

        stuList.add(new TestStu9("김뜨도",80,80,80));
        stuList.add(new TestStu9("김도뜨",60,60,60));
        stuList.add(new TestStu9("김트도",50,20,30));

        for(TestStu9 stu : stuList){
            if (stu.getTotalS()>=150){
                System.out.println(stu);
            }
        }
        int sum = 0;
        for (int i = 0; i < stuList.size(); i++){
            sum += stuList.get(i).getTotalS();

        }
        double avg = (double)(sum/stuList.size());
        System.out.println(sum);
        System.out.println(stuList.size());
        System.out.println("학생들의 평균 : " + avg);

        int maxIndex = 0 ;
        for (int i = 0; i <stuList.size() ; i++ ){
            if(stuList.get(i).getTotalS()>stuList.get(maxIndex).getTotalS()){
                maxIndex = i;
            }
        }
        System.out.println(stuList.get(maxIndex));
    }
}