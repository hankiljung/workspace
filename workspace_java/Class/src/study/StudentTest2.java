package study;

public class StudentTest2 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.printInfo();

        stu1.name="김길동";
        stu1.age = 20;
        stu1.score = 90;
        stu1.printInfo();

        stu1.setInfo("홍길동",21, 96);
        stu1.printInfo();

        Student stu2 = new Student();
        stu2.setName("박길동");
        stu2.setAge(20);
        stu2.setScore(90);
        stu2.printInfo();

        Student stu3 = new Student();
        stu3.setInfo("정한길",34,100);
        stu3.printInfo();

    }
}