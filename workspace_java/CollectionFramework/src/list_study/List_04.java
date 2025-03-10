package list_study;

import java.util.ArrayList;
import java.util.List;

public class List_04 {
    public static void main(String[] args) {
        Person p1 = new Person("김동김", 20 ,"울산시");
        Person p2 = new Person("홍홍홍", 30 ,"부산시");
        Person p3 = new Person("리리리", 40 ,"서산시");


        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p3);
        list.add(p2);
        list.add(p3);
        list.add(p2);
        list.add(p1);
        list.add(p3);

        for ( Person e :list){
            System.out.println(e);
        }

        System.out.println();

        //울산시에 거주하는 회원의 모든 정보 출력
        for (Person e: list){
            if (e.getAddr().contains("울산")){
                System.out.println(e);
            }
        }

        System.out.println();
        for (int i = 0; i < list.size(); i++){
            if(list.get(i).getAddr().contains("울산")){
                System.out.println(list.get(i));
            }
        }
    }
}