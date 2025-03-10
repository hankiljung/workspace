package study;

//배열의 값 저장 및 읽기
public class Array_03 {
    public static void main(String[] args) {

        int[] arr1 = new int[6];

        //배열 출력은 변수명으로 할 수 없음
//        System.out.println(arr1);

        /// arr1의 0번째 요소를 출력
        System.out.println(arr1[2]);

        //배열의 각 요소에 값 저장
        //arr1의 첫번째 요소에 3을 저장
        arr1[0] = 3;
        arr1[1] = 7;
        arr1[2] = 5;


        /*배열의 모든 요소의 값을 출력하는 법*/
        for(int i = 0 ; i < 6; i++){
            System.out.print(arr1[i] + " ");
        }
        //배열의 모든 요소를 출력할 때 사용 할 수 있는 명령어
        int[] arr4 = new int[10];

        /// arr4 배열의 모든 요소를 출력하는 코드를 작성
        System.out.println();
        int i=0;
        while (i<arr4.length) {
            System.out.print(arr4[i]);
            i++;
        }

        System.out.println();

        for(i=0; i<arr4.length; i++ ) {
            System.out.print(arr4[i]);
        }
        System.out.println();
        System.out.print("arr4 배열의 크기 : "  + arr4.length);

        }



}

