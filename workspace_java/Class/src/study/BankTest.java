package study;

import java.util.Scanner;

public class BankTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank[] bankArr = new Bank[5];
        //bank클래스에 대한 객체 생성
        int index=0;
        bankArr[0] = new Bank("최자바", 15000, "3021313");
        bankArr[1] = new Bank("홍동", 25000, "3021313");
        bankArr[2] = new Bank("홍길", 35000, "3021313");
        bankArr[3] = new Bank("길홍", 45000, "3021313");
        bankArr[4] = new Bank("동동", 55000, "3021313");
        int sum1 = 0;
        int sum2 = 0;
        //bankArr에 배열에 저장된 모든 계좌의 예금액 합을 출력
        for( Bank bank: bankArr){
                sum1 += bank.getBalance();
        }

        for (int i = 0 ; i <bankArr.length; i++){

            sum2 += bankArr[i].getBalance();
        }
                System.out.println(sum1);
                System.out.println(sum2);

        for (int i = 0; i<bankArr.length; i++){
            if(bankArr[i].getOwner().equals(sc.next())){
                System.out.println("계좌주를 입력하세요");
                bankArr[i].setBalance((int)(bankArr[i].getBalance()*1.2));
                System.out.println(bankArr[i].getBalance());
            }
        }

        for ( Bank bank: bankArr){
            System.out.println("계좌주를 입력하세요");
          if(  bank.getOwner().equals(sc.next())){
              bank.setBalance((int)(bank.getBalance()*1.2));
              System.out.println(bank.getBalance());
          }
        }

    }


}