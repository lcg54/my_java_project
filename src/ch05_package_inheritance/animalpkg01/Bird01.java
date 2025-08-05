package ch05_package_inheritance.animalpkg01;

public class Bird01 extends Animal01{
    private int wing;

    public Bird01(String name, int lifespan, String habitat, int speed, int wing) {
        super(name, lifespan, habitat, speed);
        this.wing = wing;
    }
    public String fly() {
        return toString() + "날아 다닙니다.";
    }

    public void show() {
        super.show2();
        System.out.println(getName() + "의 날개 개수는 " + wing + "개입니다.");
        System.out.println(fly());
        System.out.println();
    }
}
