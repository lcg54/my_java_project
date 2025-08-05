package ch05_package_inheritance.general;
// 서브클래스 extends 슈퍼클래스
public class Americano03 extends Beverage03{
    private double waterAmount; // 투입된 물의 양

    public Americano03(String name, double price, double waterAmount) {
        super(name, price);
        this.waterAmount = waterAmount;
    }
//출력만 하면 되므로 getter 안만들어도 됨
    public void display() {
        super.superdisplay();
        System.out.println("투입된 물의 양 : " + waterAmount + "ml");
        System.out.println();
    }

}
