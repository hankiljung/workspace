package test;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.setPhoneBrand("samsung");
        phone1.setPhoneModel("galaxy23");
        phone1.setPhoneColor("red");
        phone1.setPhonePrice(230000);
        phone1.setPhoneNum("010-2323-5656");

        phone1.printPhone();
    }
}
