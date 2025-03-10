package static_study;
//        cnt = 0 ; static 변수는 생성자에서 초기화하지 않는다.

public class Count {
    static int cnt;

    //static 변수 초기화 구문
    static {
        cnt = 0;
    }

    public Count(){
        System.out.println("생성자 실행~");
        cnt++;
        System.out.println("cnt : " + cnt);
    }
}
