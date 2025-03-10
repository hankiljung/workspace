package cacul;

import java.util.Scanner;
import java.util.Set;

public class CalTest {
    Scanner sc = new Scanner(System.in);
    private int a;
    private int b;
    private String oper;

    public CalTest() {
        System.out.print("첫번째 수 : ");
        this.a = sc.nextInt();

        System.out.print("두번째 수 : ");
        this.b = sc.nextInt();

        System.out.print("연산자 : ");
        this.oper = sc.next();
    }

    public void calResult(){
        switch (oper){
            case "+" :
                Add add = new Add();
                add.setValue(a, b);
                add.cal();
                System.out.println("A + B = " + add.cal());
               break;

            case "-" :
                Sub sub = new Sub();
                sub.setValue(a, b);
                sub.cal();
                System.out.println("A - B = " + sub.cal());
               break;

            case "*" :
                Mul mul = new Mul();
                mul.setValue(a, b);
                mul.cal();
                System.out.println("A * B = " + mul.cal());
               break;

            case "/" :
                Div div = new Div();
                div.setValue(a, b);
                div.cal();
                System.out.println("A / B = " + div.cal());
               break;

            default:
                System.out.println("연산자를 잘못 입력했습니다.");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalTest cal  = new CalTest();
        cal.calResult();


    }
}
