package study;

public class LgTv implements Tv{
  @Override
  public void powerOn() {
    System.out.println("엘지티비 - 전원 켬");
  }

  @Override
  public void powerOff() {
    System.out.println("엘지티비 - 전원 끔");
  }

  @Override
  public void soundUp() {
    System.out.println("엘지티비 - 볼륨 업");
  }

  @Override
  public void soundDown() {
    System.out.println("엘지티비 - 볼륨 다운");
  }
}
