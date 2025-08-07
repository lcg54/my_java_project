package ch06_abstract_interface.cartest;

public class Sonata extends Car{
    private String maker;

    public Sonata(String name, int price, Key keyType, String maker) {
        super(name, price, keyType);
        this.maker = maker;
    }
    @Override
    public String toString() {
        return info() + "\n메이커 : " + maker;
    }
}
