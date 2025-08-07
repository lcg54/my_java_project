package ch06_abstract_interface.cartest;

public class Grandeur extends Car {
    private double fuel;

    public Grandeur(String name, int price, Key keyType, double fuel) {
        super(name, price, keyType);
        this.fuel = fuel;
    }
    @Override
    public String toString() {
        String remark = "";
        if (fuel >= 20){
            remark = "excellent";
        }else if (fuel >= 10){
            remark = "good";
        }else{
            remark = "poor";
        }
        return info() + "\n연비 : " + fuel
                + "\n연비 메모 : " + remark;
    }
    @Override
    public void display(){
        String mile = String.format("%.3f",getCurrentSpeed()/1.6);
        System.out.println(getName() + "의 현재 속도는 " + mile + "mile 입니다.");
    }
}
