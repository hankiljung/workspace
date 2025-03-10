package test;

public class Song1Test {
    public static void main(String[] args) {
        Song1 song2 = new Song1();
        String[] arr = {"작곡 3 ", "작곡 2 ", "작곡 1"};
        song2.setInfo("가자", "가수", "가즈아",2020, arr);
        song2.printAll();
    }
}
