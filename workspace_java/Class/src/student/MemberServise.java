package student;

public class MemberServise {
    public static void main(String[] args) {
        Member2 n2 = new Member2("hong","12345");
        boolean result = n2.login("hong","12345");
        if(result){
            System.out.println("로그인 되었습니다");
        }
        else{
            System.out.println("id 또는 pw가 틀림");
        }

    }
}
