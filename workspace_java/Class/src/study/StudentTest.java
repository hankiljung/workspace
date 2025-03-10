package study;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student stu1 = new Student();
        Student stu2 = new Student();

        stu1.setInfo("이순신", 30, 95);
        stu1.printInfo();

        stu2.name = "고길동";
        stu2.setAge(21);
        stu2.setScore(95);
        stu2.printInfo();




    }
}
