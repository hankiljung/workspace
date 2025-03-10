package Study;

public class Monitor {
    String brand;
    String color;
    double inch;

    //생성자 문법 public 클래스명(){}
    //생성자의 목적 : 맴버변수의 초기값 설정을 위해 생성자 사용
    //클래스에 생성자 1도 없으면 기본 생성자 자동 생성
    //생성자는 메서드 오버로딩 문법으로 여러개 생성 가능
    //생성자를 하나라도 만들면, 기본생성자가 자동으로 만들어지지 않는다..


    //생성자는 오버로딩 개념을 통해 여러개 생성 가능
    public Monitor(){
        this.brand = "samsung";
    }
    public Monitor(String brand){
        this.brand = brand;
    }
    public Monitor(String brand, String color){
        this. brand = brand;
        this.color = color;
        inch = 24.0;
    }
    public void printInfo(){
        System.out.println("브랜드 : " + brand);
        System.out.println("컬러 : " +  color);
        System.out.println("inch: " + inch);

    }

}
