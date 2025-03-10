package emp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpService {

    /// 부서별 연봉조회 메서드
    public void moneyInfo(){
        Scanner sc = new Scanner(System.in);
        Emp mem1 = new Emp(1, "정한길", "컴푸터", "010-2020-1111",10000);
        Emp mem3 = new Emp(3, "정한길", "컴퓨터", "010-2020-1113",10000);
        Emp mem4 = new Emp(4, "정한길", "컴푸터", "010-2020-1114",10000);
        Emp mem5 = new Emp(5, "정한길", "컴푸터", "010-2020-1115",10000);

        List<Emp> list = new ArrayList<>();

        list.add(mem1);
        list.add(mem3);
        list.add(mem4);
        list.add(mem5);

        System.out.print("부서명 : ");
        String a = sc.next();
        int mSum = 0 ;
        int cnt = 0;

        System.out.println("==개발부 월급 현황==");
        for (int i = 0 ; i < list.size(); i++){
            if(list.get(i).getDept().equals(a)){
                System.out.print("이름  :  " + list.get(i).getName());
                System.out.print(",   월급  :  " + list.get(i).getMoeny());
                System.out.println();
                cnt++;
                mSum += list.get(i).getMoeny();
            }
        }
        double moneyDiv = mSum/cnt;
        System.out.println();
        System.out.println("개발 부서의 월급 총액은 " + mSum +"이며, 평균 급여는" + moneyDiv +"원 입니다.");

    }



    /// 임금인상 메서드
    public void moneyUp(){
        Scanner sc = new Scanner(System.in);
        Emp mem1 = new Emp(1, "정한길", "컴푸터", "010-2020-1111",10000);
        Emp mem3 = new Emp(3, "정한길", "컴푸터", "010-2020-1113",10000);
        Emp mem4 = new Emp(4, "정한길", "컴푸터", "010-2020-1114",10000);
        Emp mem5 = new Emp(5, "정한길", "컴푸터", "010-2020-1115",10000);

        List<Emp> list = new ArrayList<>();

        list.add(mem1);
        list.add(mem3);
        list.add(mem4);
        list.add(mem5);
        System.out.print("부서명 : ");
        String a = sc.next();
        System.out.print("인상액 : ");
        int b = sc.nextInt();
        System.out.println(a+"부 각 사원의 급여가 각각 " +b+"원씩 인상됩니다.");
        System.out.println("===월급 인상 후 개발부 월급 현황===");
        for (int i = 0 ; i < list.size(); i++){
            if(list.get(i).getDept().equals(a)){
                list.get(i).setMoeny(list.get(i).getMoeny()+b);
                System.out.print("이름  :  " + list.get(i).getName());
                System.out.print(",   월급  :  " + list.get(i).getMoeny());
                System.out.println();
            }
        }


    }




    /// 로그인 메서드
     public void login(){
         Scanner sc = new Scanner(System.in);
         Emp mem1 = new Emp(1, "정한길", "컴푸터", "010-2020-1111",10000);
         Emp mem3 = new Emp(3, "정한길", "컴푸터", "010-2020-1113",10000);
         Emp mem4 = new Emp(4, "정한길", "컴푸터", "010-2020-1114",10000);
         Emp mem5 = new Emp(5, "정한길", "컴푸터", "010-2020-1115",10000);

         List<Emp> list = new ArrayList<>();

         list.add(mem1);
         list.add(mem3);
         list.add(mem4);
         list.add(mem5);

         System.out.print("사번 : ");
         int a = sc.nextInt();

         for (int i = 0; i < list.size(); i++) {
             if (a == list.get(i).getMemNum()) {
                 System.out.print("비밀번호(연락처 마지막 4자리)");
                 String c = sc.next();
                 if (c.equals(list.get(i).getPw())) {
                     System.out.println("로그인 하였습니다.");
                     System.out.println("홍길동님 반갑습니다.");
                     break;
                 }
                 else {
                     System.out.println("비밀번호가 틀립니다.");
                     break;
                 }
             }
         }
     }
}








