package study;

public class PersonMGR2 {
  public static void main(String[] args) {
    Friend[] fs = new Friend[10];

    int cnt = 0;

    fs[cnt++] = new UnivFriend("kim","010-1111","생물학과");
    fs[cnt++] = new UnivFriend("lee","010-1112","방송학과");
    fs[cnt++] = new ComFriend("김사원","010-1112","영업부 ");
    fs[cnt++] = new ComFriend("박대리님","010-1112","인사부");

    for(int i = 0 ;  i<cnt ; i ++){
      fs[i].showInfo();
      System.out.println("-----------------------------------");
    }

  }
}
