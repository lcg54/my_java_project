package ch06_abstract_interface.beveragetest;

public class Latte extends Beverage{
    private String milkType;

    public Latte(String name, double price, String milkType) {
        super(name, price);
        this.milkType = milkType;
    }

    public void drink(){
        System.out.println("부드럽고 크리미한 " + getName() + "를 마십니다.");
    }
    public void make(){
        System.out.println(getName() + " 제조법");
        System.out.println("에스프레소 1샷을 추출합니다.");
        System.out.println("에스프레소를 먼저 넣고 데운 " + milkType +"를 나중에 부으면 됩니다.");
    }
}
