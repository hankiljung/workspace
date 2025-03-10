package study;

public class FriendMGR {
  public static void main(String[] args) {

    Friend f1 = new ComFriend("홍길동", "010-2323-3234","과장");
    Friend f2 = new UnivFriend("박길동", "010-2423-2523", "부장");

    int ucnt = 0;

    Friend[] fs = new Friend[10];

    fs[ucnt++] = new UnivFriend("kim","010-1111","생물학과");
    fs[ucnt++] = new UnivFriend("lee","010-1112","방송학과");
    fs[ucnt++] = new ComFriend("김사원","010-1112","영업부 ");
    fs[ucnt++] = new ComFriend("박대리님","010-1112","인사부");

    fs[0].showInfo();

  }
}
