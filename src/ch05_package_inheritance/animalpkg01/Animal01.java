package ch05_package_inheritance.animalpkg01;

public abstract class Animal01 { // 추상 클래스
    private String name;
    private int lifespan;
    private String habitat;
    private int speed;

    public Animal01(String name, int lifespan, String habitat, int speed) {
        this.name = name;
        this.lifespan = lifespan;
        this.habitat = habitat;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return name + "이(가)" + speed + "의 속도로 ";
    }

    protected void show2() {
        System.out.print("평균 수명이 " + lifespan +"년인 ");
        System.out.print(name + "의 서식지는 ");
        System.out.println(habitat + "입니다.");
    }
}
