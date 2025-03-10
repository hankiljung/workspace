import java.util.Scanner;

public class 백준7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour, min;
        int a;
        System.out.println("시간을 입력하세요 : ");
        hour = sc.nextInt();
        min = sc.nextInt();
        a = min-45;
        if(min<45  && hour==0){
           hour=23;
            min=60-(45-min);
        }
        else if(min<45 ){
            --hour;
            min=60-(45-min);
        }

        else if(min>45){
            min = min-45;
            --hour;
        }
        else if(hour==0){
            hour=23;
        }
        else{

        }

        System.out.println(hour +"" + min);
    }
}
