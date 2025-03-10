package study;
/// 메서드명은 중복되면 안된다.
public class Method_02 {
    public static void printName(){
        //이름을 출력하는 메서드 정의
        System.out.println("제 이름 홍길동입니다.");
    }

    public static void printAge(){
        System.out.println("제 나이는 33살입니다.");
    }

    public static void main(String[] args) {
        System.out.println("시작");
        //메서드의 호출은 여러번 가능

        printName(); // 메서드 호출(이름)
        printName(); // 메서드 호출(이름)
        printName(); // 메서드 호출(이름)
        System.out.println("중간");
        printName(); // 메서드 호출(이름)
        printName(); // 메서드 호출(이름)
        printName(); // 메서드 호출(이름)
        printName(); // 메서드 호출(이름)
        System.out.println("끝~!");
    }


}
