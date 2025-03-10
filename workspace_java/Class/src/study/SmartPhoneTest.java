package study;

import java.util.Scanner;

//클래스 자료형을 배열로 활용하기
public class SmartPhoneTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartPhone[] phones = new SmartPhone[5];
        SmartPhone p1 = new SmartPhone("s1", 10000, 12.5);
        SmartPhone p2 = new SmartPhone("s2", 20000, 13.5);
        SmartPhone p3 = new SmartPhone("s3", 30000, 14.5);
        SmartPhone p4 = new SmartPhone("s4", 40000, 15.5);
        SmartPhone p5 = new SmartPhone("s5", 50000, 16.5);

        //폰 객체를 배열에 저장
        phones[0] = p1;
        phones[1] = p2;
        phones[2] = p3;
        phones[3] = p4;
        phones[4] = p5;

        int index = 0 ;

        //phoneArr 배열에 저장된 모든 폰의 모델명, 가격, 크기를 출력
        for (int i = 0 ; i< phones.length; i++){
            phones[i].printInfo();
        }
        System.out.println(phones[0].getPrice());

        //phones 배열에서 크기가 13인치 이상인 폰의 모델명을 모두 출력
        for (int i = 0; i < phones.length; i++){
            if(phones[i].getInch() >= 13){
                System.out.println(phones[i].getModelName());
            }
        }

        for( SmartPhone e  : phones){
            if(e.getInch() >13){
                System.out.println(e.getModelName());
            }
        }

    }
}
