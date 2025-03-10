package test;

import java.util.Arrays;

public class Song1 {
    String title;
    String artist;
    String album;
    int year;
    String[] composer = new String[3];

    public void setInfo(String title, String artist, String album, int year, String[] composer){
        this.title = title;
        this.artist=artist;
        this.album=album;
        this.year=year;
        this.composer[0]= composer[0];
        this.composer[1]= composer[1];
        this.composer[2]= composer[2];
    }
    public void printAll(){
        System.out.println("-----------------------");
        System.out.println("제목은 : " + title);
        System.out.println("가수는 : " + artist);
        System.out.println("앨범이름: " + album);
        System.out.println("발매년도 : " + year);
        System.out.println("작곡가 : " + Arrays.toString(composer));
        System.out.println("-----------------------");
    }
}
