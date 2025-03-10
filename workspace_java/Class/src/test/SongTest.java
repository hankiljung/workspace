package test;

public class SongTest {
    public static void main(String[] args) {
        Song song1 = new Song();
        String[] com = {"작곡가1", "작곡가2", "작곡가3"};
        song1.setInfo("대강" , "두길", "한길", 2020, com );
        song1.printInfo();
    }
}
