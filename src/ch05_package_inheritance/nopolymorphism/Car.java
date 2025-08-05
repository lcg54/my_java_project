package ch05_package_inheritance.nopolymorphism;

public abstract class Car {
    private String name;
    private int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public final String superInfo(){ // 오버라이딩 금지 (강제)
        return "가격 : " + price + "원\n" + "차량 : " + name + " 시승";
    }
    public abstract String subInfo(); // 오버라이딩 필수 (강제)

    public final String calcTax(){
        double tax; // 인스턴스로 안쓰고 지역변수로 사용
        if (price>=150){
            tax = (double) price/10;
        } else{
            tax = (double) price/20;
        }
        return "세금 : " + tax + "원";
    }
}
