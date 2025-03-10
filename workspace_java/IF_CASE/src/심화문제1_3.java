import java.util.Scanner;

public class 심화문제1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a;

        System.out.println("정수를 입력하세요 : ");
        a = sc.next();
        if(a.contains("33") ){
            System.out.println("짝짝");
            }

        else if(a.contains("66") ){
            System.out.println("짝짝");
           }
        else if(a.contains("99") ){
            System.out.println("짝짝");
        }
        else if(a.contains("36") ){
            System.out.println("짝짝");
        }
        else if(a.contains("39") ){
            System.out.println("짝짝");
        }
        else if(a.contains("69") ){
            System.out.println("짝짝");
        }
        else if(a.contains("96") ){
            System.out.println("짝짝");
        }
        else if(a.contains("93") ){
            System.out.println("짝짝");
        }
        else if(a.contains("63") ){
            System.out.println("짝짝");
        }
        else if(a.contains("3") ||a.contains("6")||a.contains("9")){
            System.out.println("짝");
        }
        else {
            System.out.println("없다");
        }

    }
}
