package Test4;

public class Member {
  private String id;
  private String pw;
  private String name;
  private int age;

  public Member() {

  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPw() {
    return pw;
  }

  public void setPw(String pw) {
    this.pw = pw;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Member{" +
        "id='" + id + '\'' +
        ", pw='" + pw + '\'' +
        ", name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

  public void showInfo(){
    System.out.println("아이디 : " +
            getId());
    System.out.println("비밀번호 : "+getPw());
    System.out.println("이름 : " +getName());
    System.out.println("나이 :  " +getAge());
  }

  public boolean isLogin(String id, String pw){
    boolean logSet = (getId().equals(id)&&getPw().equals(pw));
    if(logSet){
      System.out.println("로그인 가능");
    }
    else
    System.out.println("로그인 실패");

    return logSet ;
  }

}
