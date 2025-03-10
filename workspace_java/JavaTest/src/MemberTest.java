package Test4;

public class MemberTest {
  public static void main(String[] args) {
    Member m1 = new Member();
    m1.setId("java");
    m1.setPw("1234");
    m1.setName("kim");
    m1.setAge(20);
    m1.showInfo();
    m1.isLogin("java","1234");
    m1.isLogin("java","1111");

  }
}
