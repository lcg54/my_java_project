package ch05_package_inheritance.mybeverage;

public class Americano04 extends Beverage04 {
    private double waterAmount;

    public Americano04(String name, double price, double waterAmount) {
        super(name, price);
        this.waterAmount = waterAmount;
    }
    public String sipAmericano(){
        return getName() + "를(을) 홀짝 홀짝 마십니다.";
    }
    @Override
    public void display() {
        super.display();
        System.out.println("투입된 물의 양 : " + waterAmount);
        System.out.println(sipAmericano());
    }
}
