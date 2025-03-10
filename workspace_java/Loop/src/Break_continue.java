public class Break_continue {
    public static void main(String[] args) {
        //반복문에 break, continue 라는 명령어를 사용할 수 있음
        int i =1;
        while (i < 6) {
            if( i ==3 ){
                break;
                //가장 가까운 반복문(조건문이 아님)을 종료(벗어남;)
            }
            System.out.println(i);
            i++;
        }
        for(int a = 3; a<6; a++){
            System.out.println(a);
        }
        System.out.println();

        /// /////////////////////////////////////////////////////////////////////
        /*continue*/

        int b =0;
        while(b<20){
            b++;
            if(b%3==0){/*가장 가까운 반복문의 마지막으로 이동한다*/
                continue;
            }
            System.out.println(b);
        }

    }
}