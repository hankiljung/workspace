package student;

import java.util.Scanner;

public class StudentManagerTest {
    public static void main(String[] args) {
        System.out.println("학생 관리 프로그램을 실행합니다.");
        boolean run = true;
        int index = 0;
        StudentManager stu = new StudentManager();
        Scanner sc= new Scanner(System.in);
        while(run){
            System.out.println();
            System.out.print("1) 학생등록   ");
            System.out.print("2) 학생정보 변경   ");
            System.out.print("3) 학생정보출력   ");
            System.out.print("4) 모든학생정보출력   ");
            System.out.print("5) 학생등록   ");
            System.out.println();
            System.out.print(" 번호를 고르세요 ");


            int selNum = sc.nextInt();
            switch (selNum){
                case 1 :
                    stu.regStu();
                    break;
                case 2 :
                    stu.setTel();
                    break;
                case 3 :
                    stu.printStu();
                    break;
                case 4 :
                    stu.printAll();
                    break;
                case 5 :
                    System.out.println();
                    System.out.println("프로그램을 종료합니다.");
                    run = false;
                    break;
                default:
                    System.out.println("1~5번 중 하나를 입력하세요");
            }

        }

    }
}
