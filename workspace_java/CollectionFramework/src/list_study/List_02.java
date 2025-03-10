package list_study;

import java.util.ArrayList;
import java.util.List;

public class List_02 {
    public static void main(String[] args) {
        /*배열과 다르게 데이터의 저장할 갯수 제한이 없다*/
        List<Integer> list1 = new ArrayList<>();

        //list1에 데이터 추가
        list1.add(5); // 넣는 순서대로 0부터 index가 설정
        list1.add(3);
        list1.add(10);
        list1.add(5);

        //list1에 저장된 데이터 읽기
        //get()의 메서드의 안에서 index가 들어감
        System.out.println( list1.get(1) );

        // 데이터 변경
        list1.set(0,3);

        //list1에 저장된 데이터 삭제
        list1.remove(0);
        System.out.println(list1.get(0));
        System.out.println(list1.size());


    }
}
