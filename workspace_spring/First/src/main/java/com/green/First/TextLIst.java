package com.green.First;

public class TextLIst {
  private int num;
  private String title;
  private String writer;
  private int readCnt;


  public TextLIst(int num, String title, String writer, int readCnt) {
    this.num = num;
    this.title = title;
    this.writer = writer;
    this.readCnt = readCnt;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getWriter() {
    return writer;
  }

  public void setWriter(String writer) {
    this.writer = writer;
  }

  public int getReadCnt() {
    return readCnt;
  }

  public void setReadCnt(int readCnt) {
    this.readCnt = readCnt;
  }
}
