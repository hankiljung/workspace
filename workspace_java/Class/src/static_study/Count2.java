package static_study;

public class Count2 {
    static int cnt;
    int num;

    static {
        cnt = 0;
    }


    public void aaa(){
        System.out.println(cnt);
        bbb();
    }

    public static void bbb(){
        System.out.println(cnt);
    }

    public void main(String[] args) {
        aaa();
    }
}
