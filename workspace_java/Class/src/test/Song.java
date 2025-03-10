package test;

public class Song {
    String title;
    String artist;
    String album;
    int year;
    String[] composer= new String[3];

    public void setInfo(String a, String b, String c, int d, String[] e){
        title = a;
        artist = b;
        album = c;
        year = d;
        composer[0] = e[0];
        composer[1] = e[1];
        composer[2] = e[2];
    }
    public  void printInfo(){
        System.out.println("-----------------");
        System.out.println("- 노래 제목 : " + title);
        System.out.println("- 가수 : " + artist);
        System.out.println("- 앨범 : " + album);
        System.out.println("- 발표년도 : " + year);
        System.out.println("- 작곡가 : [" + composer[0]+", "+composer[1]+", "+composer[2]+"]");
        System.out.println("-----------------");
    }
}
