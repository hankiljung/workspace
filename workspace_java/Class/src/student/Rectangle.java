package student;

import java.util.Set;

public class Rectangle {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Rectangle() {}

    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    void set(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int square(){
        return (x2-x1)*(y2-y1);
    }

    public  void show(){
        System.out.println();
        System.out.println(square());
        System.out.print(x1 + "  ");
        System.out.print(x2 + "  ");
        System.out.print(y1 + "  ");
        System.out.print(y2 + "  ");

    }
    boolean equals(Rectangle a){
        if(square()==a.square()){
            return true;
        }
        else {
            return false;
        }
        }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Rectangle s = new Rectangle(1,1,2,3);
        r.set(-2,2,-1,4);
        r.show();
        s.show();
        if (r.equals(s)){
            System.out.println("두 사각형은 같다");
        }
    }
    }
