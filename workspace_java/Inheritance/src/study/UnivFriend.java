package study;

import javax.naming.Name;

//대학 동창 정보
public class UnivFriend extends Friend{

  private String major;

    public UnivFriend(String name, String tel, String major) {
      super(name, tel);
      this.major = major;
    }

    public void showInfo(){
      super.showInfo();
      System.out.println("전공 : " + major);
    }
  }
