package test;

import java.util.Scanner;

public class Calculrator {
    int first;
    double second;
    String cal;

    public void calcul(int a, double b, String c){
        first = a;
        second =b;
        cal = c;

        if (c.contains("+")){
                System.out.println();
                System.out.println("-----------결과-----------");
                System.out.println(a +" + "+(int)b+" = "+(int)(a+b)  );
                System.out.println("----------------------------");
                System.out.println();
        }
        if (c.equals("-")){
                System.out.println();
                System.out.println("-----------결과-----------");
                System.out.println(a +" - "+(int)b+" = "+(int)(a-b)  );
                System.out.println("----------------------------");
                System.out.println();
        }
        if (c.equals("*")){
                System.out.println();
                System.out.println("-----------결과-----------");
                System.out.println(a +" X "+(int)b+" = "+(int)(a*b)  );
                System.out.println("----------------------------");
                System.out.println();
        }
        if (c.equals("/")){
            if (a%b==0){
                System.out.println();
                System.out.println("-----------결과-----------");
                System.out.println(a +" / "+(int)b+" = "+(int)(a/b) );
                System.out.println("----------------------------");
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println("-----------결과-----------");
                System.out.println(a +" / "+(int)b+" = "+(a/b) );
                System.out.println("----------------------------");
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1번 수 : ");
        int a =sc.nextInt();
        System.out.print("2번 수 : ");
        int b =sc.nextInt();
        System.out.print("연산자 : ");
        String c = sc.next();
        Calculrator cal  = new Calculrator();

        cal.calcul(a,b,c);

    }
}