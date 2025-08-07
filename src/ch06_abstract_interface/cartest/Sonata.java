package ch06_abstract_interface.cartest;

public class Sonata extends Car{
    private String maker;

    public Sonata(String name, int price, Key keyType, String maker) {
        super(name, price, keyType);
        this.maker = maker;
    }
    @Override
    public void sayHello(String getName, int repeatCount){
        for (int i = 0; i < repeatCount; i++) {
            System.out.println("안녕~~방가워~~" + getName);
        }
    }
    @Override
    public String toString() {
        return info() + "\n메이커 : " + maker;
    }
}
