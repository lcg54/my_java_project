package ch05_package_inheritance.general;
// 슈퍼클래스
public class Beverage03 {
    private String name; // 이름
    private Double price; // 단가

    public Beverage03(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    protected void superdisplay() {
        System.out.println("음료 이름 : " + name);
        System.out.println("단가 : " + price);
    }
}
