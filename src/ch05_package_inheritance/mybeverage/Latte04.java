package ch05_package_inheritance.mybeverage;

public class Latte04 extends Beverage04{
    private String milkType;

    public Latte04(String name, double price, String milkType) {
        super(name, price);
        this.milkType = milkType;
    }
    public String enjoyLatte() {
        return "부드럽고 크리미한 " + getName() + "를 마십니다.";
    }
    @Override
    public void display() {
        super.display();
        System.out.println("우유 타입 : " + milkType);
        System.out.println(enjoyLatte());
    }
}
