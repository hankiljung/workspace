package study;
public class ComFriend extends Friend{
  private String dept;

  public ComFriend(String name, String tel, String dept) {
    super(name, tel);
    this.dept = dept;
  }

  public void showInfo(){
    super.showInfo();
    System.out.println("부서 : " + dept);
  }

}
