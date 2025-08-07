package ch06_abstract_interface.cartest;

public class Grandeur extends Car {
    private double fuel;

    public Grandeur(String name, int price, Key keyType, double fuel) {
        super(name, price, keyType);
        this.fuel = fuel;
    }
    @Override
    public void sayHello(String getName, int repeatCount){
        for (int i = 0; i < repeatCount; i++) {
            System.out.println("안녕~~방가워~~" + getName);
        }
    }
    @Override
    public String toString() {
        return info() + "\n연비 : " + fuel;
    }
}
