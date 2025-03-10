package test2;

public class TestStu9 {
    private String name;
    private int korS;
    private int mathS;
    private int engS;
    private int totalS;

    public TestStu9(String name, int korS, int mathS, int engS) {
        this.name = name;
        this.korS = korS;
        this.mathS = mathS;
        this.engS = engS;
        totalS = mathS+engS+korS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKorS() {
        return korS;
    }

    public void setKorS(int korS) {
        this.korS = korS;
    }

    public int getMathS() {
        return mathS;
    }

    public void setMathS(int mathS) {
        this.mathS = mathS;
    }

    public int getEngS() {
        return engS;
    }

    public void setEngS(int engS) {
        this.engS = engS;
    }

    public int getTotalS() {
        return totalS;
    }

    public void setTotalS(int totalS) {
        this.totalS = totalS;
    }

    @Override
    public String toString() {
        return "TestStu9{" +
                "name='" + name + '\'' +
                ", korS=" + korS +
                ", mathS=" + mathS +
                ", engS=" + engS +
                ", totalS=" + totalS +
                '}';
    }
}
