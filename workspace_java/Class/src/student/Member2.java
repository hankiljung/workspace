package student;

public class Member2 {
    private String name;
    private String id;
    private String pw;
    private int age;

    public Member2(String name, String id) {
        this.name = name;
        this.id = id;
    }
    public boolean login(String id, String pw){

        this.id = id;
        this.pw = pw;
        if (this.id=="hong" && this.pw=="12345"){
            return true;
        }
        else {
            return false;
        }
    }
    public void logout(){
        System.out.println("로그아웃 되었습니다.");
    }
}
