package ch05_package_inheritance.animalpkg01;

public class Mammal01 extends Animal01{
    private int leg;

    public Mammal01(String name, int lifespan, String habitat, int speed, int leg) {
        super(name, lifespan, habitat, speed);
        this.leg = leg;
    }

    public String run() {
        return toString() + "달려갑니다.";
    }

    public void show() {
        super.show2();
        System.out.println(getName() + "의 다리 갯수는 " + leg + "개입니다.");
        System.out.println(run());
        System.out.println();
    }
}
