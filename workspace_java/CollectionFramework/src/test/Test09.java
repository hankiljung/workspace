package test;

public class Test09 {
    private String name;
    private int kuk;
    private int eng;
    private int total;


    public Test09(String name, int kuk, int eng) {
        this.name = name;
        this.kuk = kuk;
        this.eng = eng;
        this.total = kuk+eng;
    }

    @Override
    public String toString() {
        return "Test09{" +
                "name='" + name + '\'' +
                ", kuk=" + kuk +
                ", eng=" + eng +
                ", total=" + total +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKuk() {
        return kuk;
    }

    public void setKuk(int kuk) {
        this.kuk = kuk;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
