package study;

public class Friend {
 private String name;
 private String tel;

  public Friend(String name, String tel) {
    this.name = name;
    this.tel = tel;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public void showInfo(){
    System.out.println("이름 : " + getName());
    System.out.println("연락처 : " + getTel());
  }
}
