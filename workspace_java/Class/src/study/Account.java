package Study;

///  맴버변수 초기값을 갖는 것이 좋은 코드다

public class Account {
    String accNumber; // '1111-2222'
    int money; // 예금액
    String owner; // 계좌주
    //생성자는 맴버변수 밑에 작성한다

    //맴버변수의 값을 초기화하는 기능
    // 생성자 (constructor) - 맴버변수의 값의 초기값을 할당할 목적
    // 생성자는 메서드의 일종이다.
    // 만약 클래스에 생성자가 하나도 없으면 자동으로 기본 생성자를 생성함
    // 기본생성자(default constructor)
    public Account() {
        this.accNumber = "지정되지 않음";
        this.money = 0;
        this.owner = "지정되지 않음";
    }

    public String getAccNumber() {
        return accNumber;
    }

    //952

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void deposit(int money){
        this.money = this.money+money;
    }
    public void printAccInfo(){
        System.out.println("계좌번호 : "+ getAccNumber() );
        System.out.println("예금액 : " + getMoney() );
        System.out.println("계좌주 : " +  getOwner());
    }

    public static void main(String[] args) {
        //생성자는 객체에 초기값을 메소드를 사용하지 않고 주기 위해 만듦
        Account a1 = new Account();

        //객체 생성 문법 : 클래스명 객체명 = new 생성자호출();
        //생성자가 생긴 이유
        // 생성자 앞에 다른 코드 올 수 없음
        // 생상자는 초기세팅 후 다시 호출 불가능

        //new Account(생성자 메서드였던것);
        a1.printAccInfo();

    }
}