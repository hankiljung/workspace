package study;

//학생을 표현할 설계도
public class Student {
    String name; // 학생 이름 데이터
    int age; // 학생의 나이
    int score; //  학생의 점수

    //이름을 변경하는 메서드

    public void setName(String a){
        name = a;
    }
    public void setScore(int score1){
        score = score1;
    }

    public void setAge(int age1){
        age = age1;
    }

    public void setInfo(String a, int b, int c){
        name = a;
        age = b;
        score = c;
    }

    //학생의 정보를 출력하는 기능
    public void printInfo(){
        System.out.println("---------------------------");
        System.out.println("1. 이름 : "+name);
        System.out.println("2. 나이 : "+age);
        System.out.println("3. 점수 : "+score);
    }
}
