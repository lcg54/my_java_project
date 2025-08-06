package ch06_abstract_interface.beveragetest;

public abstract class Beverage {
    private String name;
    private double price;

    public Beverage(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public final void showData(){
        System.out.print("음료 " + name + "의 단가는 ");
        System.out.println((int)price + "원입니다.");
    }
    protected String getName() {
        return name;
    }
    protected abstract void drink();
    protected abstract void make();
}
