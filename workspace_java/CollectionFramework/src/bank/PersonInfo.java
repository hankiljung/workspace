package bank;

import java.util.List;
import java.util.Scanner;

public class PersonInfo {
    private String name;
    private String idNum;
    private int accNum;
    private String tel;
    private int index=0;



    public PersonInfo(String name, String idNum, String tel, int accNum) {
        this.name = name;
        this.idNum = idNum;
        this.tel = tel;
        this.accNum = accNum;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }




}