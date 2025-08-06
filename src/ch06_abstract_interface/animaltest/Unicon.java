package ch06_abstract_interface.animaltest;

public class Unicon extends Animal implements Horse, Bird{
    private String name, gender, feed;

    public Unicon(String name, String gender, String feed) {
        this.name = name;
        this.gender = gender;
        this.feed = feed;
    }

    public void eat() {
        System.out.println(name + "이(가) " + feed + "을(를) 먹습니다.");
    }

    public void display(){
        int initialSpeed = 0;
        switch (gender){
            case "F": initialSpeed = Horse.speed; break;
            case "M": initialSpeed = Bird.speed; break;
        }
        System.out.println(name + "의 초기 속도는 " + initialSpeed + "입니다.");
        run();
        eat();
        fly();
    }

    public void run() {
        System.out.println(name + "이(가) 시속 " + Horse.speed + "의 속도로 달립니다.");
    }
    public void fly() {
        System.out.println(name + "이(가) 시속 " + Bird.speed + "의 속도로 날아갑니다.");
    }
}
