package list_study;

import java.util.ArrayList;
import java.util.List;

public class List_01 {
    public static void main(String[] args) {
        //문자열을 다수 저장할 수 있는 list 생성
        String[] arr;
        List<String> list = new ArrayList<>();

        // 정수를 다수 저장할 수 있는 List 생성
        //  List에 저장할 자료형은 기본 자료형 사용 못 함 
        // List에서 사용할 수 있게 기본자료형을 클래스화 시킨 자료형 존재(Wrapper 클래스)
        
        List<Byte> list7 = new ArrayList<>();
        List<Short> list6 = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Long> list5 = new ArrayList<>();
        List<Double> list2 = new ArrayList<>();
        List<Float> list4 = new ArrayList<>();
        List<Boolean> list3 = new ArrayList<>();
        List<Character> list9 = new ArrayList<>();

    }
}
