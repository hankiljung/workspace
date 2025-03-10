package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        List<PersonInfo> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        PersonInfo p = new PersonInfo(sc.next(), sc.next(), sc.next(),sc.nextInt());
        list.add(p);


        System.out.print("이름 : " );

        System.out.println("주민번호앞 : ");
    }
}
