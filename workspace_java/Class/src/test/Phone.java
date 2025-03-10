package test;

public class Phone {
    String phoneBrand;
    String phoneModel;
    String phoneColor;
    int phonePrice;
    String phoneNum;

//    public void phoneInfo(String a, String b, String c, int d, String e){
//        phoneBrand = a;
//        phoneModel = b;
//        phoneColor = c;
//        phonePrice = d;
//        phoneNum = e;
//    }
    public void setPhoneBrand(String a){
        phoneBrand = a;
    }
    public void setPhoneModel(String b){
        phoneModel = b;
    }
    public void setPhoneColor(String c){
        phoneColor = c;
    }
    public void setPhonePrice(int d){
        phonePrice = d;
    }
    public void setPhoneNum(String e){
        phoneNum = e;
    }


    public void printPhone(){
        System.out.println("--------------------------");
        System.out.println("1. 핸드폰 브랜드 : " + phoneBrand);
        System.out.println("2. 핸드폰 모델 : " + phoneModel);
        System.out.println("3. 핸드폰 컬러 : " + phoneColor);
        System.out.println("4. 핸드폰 가격 : " + phonePrice);
        System.out.println("5. 핸드폰 번호 : " + phoneNum);
        System.out.println("--------------------------");
    }

}
