package emp;

import java.util.Scanner;

public class Emp {
    Scanner sc = new Scanner(System.in);
    private int memNum;
    private String name;
    private String dept;
    private String tel;
    private int moeny;
    private String pw;

    public Emp(int memNum, String name, String dept, String tel, int moeny) {
        this.memNum = memNum;
        this.name = name;
        this.dept = dept;
        this.tel = tel;
        this.moeny = moeny;
        pw = tel.substring(tel.length()-4,tel.length());
    }

    @Override
    public String toString() {
        return "Emp{" +
                "memNum=" + memNum +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", tel='" + tel + '\'' +
                ", moeny=" + moeny +
                '}';
    }

    public int getMemNum() {
        return memNum;
    }

    public void setMemNum(int memNum) {
        this.memNum = memNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getMoeny() {
        return moeny;
    }

    public void setMoeny(int moeny) {
        this.moeny = moeny;
    }
    public void logIn(){
        System.out.print("사번 : ");
        sc.next();
        System.out.print("비밀번호(연락처 마지막 4자리)");
        String c = sc.next();
        if (c.equals(this.pw)){
            System.out.println("로그인 하였습니다.");
            System.out.println("홍길동님 반갑습니다.");
        }
        else{
            System.out.println("비밀번호가 틀립니다.");

            }

    }
}
