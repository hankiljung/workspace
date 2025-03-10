public class 자료형_03 {
    public static void main(String[] args) {
        //형(data type) 변환
        // 정수 -> 실수, 실수 -> 정수


        int num1 = 5;
        double num2 = 5;
        /*자동 형변환(promotion)*/
        /*실수>정수*/

        double num3=5.9999;
        int num4 =  (short) num3;
        /*강제 형 변환(casting)*/
        /*형 변환하려는 자료 앞에 괄호를 열고 넣어준다.*/
        System.out.println("num4 = "+ num4); //5
        /*뒤에 나오는 실수는 없앤다  */

    }
}
