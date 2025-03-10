package study;

public class SmartPhone {
    //맴버변수
    private String modelName;
    private int price;
    private double inch;

    public  SmartPhone(){
        modelName = "";
        price = 0;
        inch = 0.0;
    }
    public SmartPhone(String modelName, int price, double inch) {
        this.modelName = modelName;
        this.price = price;
        this.inch = inch;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getInch() {
        return inch;
    }

    public void setInch(double inch) {
        this.inch = inch;
    }

    public void printInfo(){
        System.out.println("모델명 : " + modelName);
        System.out.println("가격 : " + price);
        System.out.println("크기 : " + inch);
    }
}
