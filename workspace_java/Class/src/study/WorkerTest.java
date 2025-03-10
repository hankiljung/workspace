package study;

public class WorkerTest {
    public static void main(String[] args) {
        PersonInfo p1 = new PersonInfo("이름", 21);
        Worker w1 = new Worker("삼성","컴퓨터",p1);
        System.out.println(w1.personInfo.name);
    }
}
