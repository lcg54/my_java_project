package ch06_abstract_interface.templatemethod01;

public abstract class Car {
    // 탬플릿 메소드 -> 순서를 명확히(유지보수 원활), 안정성
    public final void run(){
        turnOn();
        drive();
        stop();
        turnOff();
    }
    public abstract void drive();
    public abstract void stop();
    public void turnOn(){
        System.out.println("시동을 켭니다.");
    }
    public void turnOff(){
        System.out.println("시동을 끕니다.");
    }
}
