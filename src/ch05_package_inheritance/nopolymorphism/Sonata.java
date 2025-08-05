package ch05_package_inheritance.nopolymorphism;

public class Sonata extends Car{
    private String maker;

    public Sonata(String name, int price, String maker) {
        super(name, price);
        this.maker = maker;
    }
    public String subInfo(){
        return "메이커 : " + maker;
    }
}
