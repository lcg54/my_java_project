package ch05_package_inheritance.mybeverage;

public class Espresso04 extends Beverage04{
    private int shotCount;

    public Espresso04(String name, double price, int shotCount) {
        super(name, price);
        this.shotCount = shotCount;

    }

    public String drinkEspresso(){
        return "맛이 진하고 강렬한 " + getName() + "를 마십니다.";
    }
    @Override
    public void display() {
        super.display();
        System.out.println("샷 추가 개수 : " + shotCount);
        System.out.println(drinkEspresso());
    }
}
