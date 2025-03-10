package test;

import student.Rectangle;

public class Square {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Square(){}

    public Square(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void set(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int square(){
        return (x2-x1)*(y2-y1);
    }
    public void show(){
        System.out.println("------------------------사각형 정보------------------------");
        System.out.print("좌표 : " + "("+x1+", "+y1+"),  ("+x2+", "+y2+")    ");
        System.out.print("넓이 : " + square()+"    ");
        System.out.println();
        System.out.println("---------------------------------------------------------------");
    }

    public boolean equals(Square a){
        return square() == a.square();
    }
}