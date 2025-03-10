package study;

class A {
  private int x;
  private int y;

  public A(int x) {
    this.x = x;
    this.y=1;
  }

  public A(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return "A{" +
        "x=" + x +
        ", y=" + y +
        '}';
  }
}

class B extends A{
  private int x;
  private int y;

  public B(int x) {
    super(x);
    this.x =1;
    this.y=1;
  }


  public B(int x, int y) {
    super(x, y);
    this.x =1;
    this.y=1;
  }

  public B(int x, int y, int x1) {
    super(x, y);
    this.x = x1;
    this.y=1;
  }

  public B(int x, int y, int y1, int x1) {
    super(x, y);
    this.y = y1;
    this.x = x1;
  }

  @Override
  public String toString() {
    return "B{" +
        "x=" + x +
        ", y=" + y +
        '}';
  }

  public void disp(){
    System.out.println();
  }
}
