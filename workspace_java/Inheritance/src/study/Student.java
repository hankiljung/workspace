package study;

public class Student {
  int stuNum;
  String name;

  public Student(int stuNum, String name) {
    this.stuNum = stuNum;
    this.name = name;
  }

  public int getStuNum() {
    return stuNum;
  }

  public void setStuNum(int stuNum) {
    this.stuNum = stuNum;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
    Student student = (Student)obj;
    return name == student.getName();
  }
}
