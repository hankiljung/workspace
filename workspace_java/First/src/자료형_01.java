public class 자료형_01 {
    /*자료형(data type)*/
    /*자바의 자료형은 크게 기본자료형, 참조자료형으로 구분*/

    /*기본 자료형(primitive type)8개 존재 8개 모두 소문자.*/

    /*참과 거짓 : boolean ->true, false*/
    /*정수 : byte, short, int, long*/
    /*실수 : float, double*/

    /*문자 : char(캐릭터줄임말)*/
    /*문자열(문자 나열) vs 문자 확실하게 구분해야한다.*/
    /*문자 = 한글자이면서 홀따옴표로 감싸짐*/
    /*문자열 = 여러글자, !!쌍따옴표에 싸여진 글자*/
    /*ex> 'a' : 문자 "java":a 문자열, "a"문자열, "": 문자열*/
    /*'java' = 오류*/
    /*자바에 기본 자료형에는 문자열을 저장할 '기본'자료형을 제공하지 않는다.*/
    /// 문자열 참조 자료형 : String
    /*참조자료형은 무한대*/

    public static void main(String[] args){
        /*정수 자료형은 int가 기본*/
        /*실수 자료형은 double이 기본*/
        boolean a = true;
        boolean b = false;
        boolean c = false;

        System.out.println(a);

        int d = 1;
        byte e = 1;
        short f = 1;
        long g = 1L; /*정답은 아님*/
        /*뒤에 L을 넣으면 long정수로 해석한다*/
        /*기본은  int정수*/
        double h = 1.5;/*정수도 들어갈 수 있다.*/
        float z = 1.5F;

        //문자열
        String s = "hello";









    }



}
