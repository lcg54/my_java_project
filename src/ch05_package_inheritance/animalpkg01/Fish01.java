package ch05_package_inheritance.animalpkg01;

public class Fish01 extends Animal01{
    private int gill; // 아가미 갯수

    public Fish01(String name, int lifespan, String habitat, int speed, int gill) {
        super(name, lifespan, habitat, speed);
        this.gill = gill;
    }

    @Override
    public String toString(){
        return super.toString() + "헤엄칩니다.";
    }

    public void show() {
        super.show2();
        System.out.println(getName() + "의 아가미수는 " + gill + "개입니다.");
        System.out.println(toString());
        System.out.println();
    }
}
