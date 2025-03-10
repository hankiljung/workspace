package test;

import java.util.ArrayList;
import java.util.List;

public class Test03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("홍길동");
        list.add("홍길동");
        list.add("홍길동");
        list.add("홍길동");
        for (String e : list){
            if(e.equals("홍길동")){
                System.out.println("해당 이름이 존재합니다");
            }
            else
                System.out.println("해당이름 없");
        }
    }
}
