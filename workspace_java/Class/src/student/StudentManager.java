package student;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentManager {
    private Scanner sc ;
    private Student[] students;
    private int index;

    public StudentManager() {
        this.sc = new Scanner(System.in);
        this.students = new Student[3];
        this.index=0;

    }

    //학생 등록 기능
    public void regStu(){
        System.out.println("학생 등록합니다");
        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("나이 : ");
        int age = sc.nextInt();
        System.out.print("연락처 : ");
        String tel = sc.next();
        System.out.print("학점 : ");
        String grade = sc.next();

        //입력받은 정보로 학생을 생성
        Student stu = new Student(name,age,grade,tel);
        students[index++]=stu;
    }

    //학생정보변경(연락처)
    public void setTel(){
        System.out.println("학생의 연락처 정보를 변경합니다");
        for (int i = 0 ; i<index; i++){
            System.out.println("변경할 학생");
            if(students[i].getName().equals(sc.next())){
                System.out.println("변경할 연락처를 입력하세요.");
                students[i].setTel(sc.next());
            }
            else{
                System.out.println("변경할 학생을 찾을 수 없습니다.");
            }
        }
    }
    //학생정보출력
    public void printStu(){
        System.out.println("학생 한 명의 정보를 출력합니다");
        for (int i = 0 ; i<index; i++){
            System.out.println("출력할 학생");
            if(students[i].getName().equals(sc.next())){
                System.out.println("요청하신 학생 정보입니다..");
                students[i].printStuInfo();
            }
            else{
                System.out.println("요청하신 학생을 찾을 수 없습니다.");
            }
        }

            }

    //모든학생 정보 출력
    public void printAll(){
        System.out.println("모든 학생의 정보를 출력합니다");
        System.out.println("모든 학생의 정보입니다. 현재 총 학생 수는"+ index +"명입니다.");
        for (int e = 0 ; e<index ; e++){
            students[e].printStuInfo();
        }
    }
}