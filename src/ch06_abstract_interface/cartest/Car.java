package ch06_abstract_interface.cartest;

public abstract class Car implements Speed, Display {
    private String name;
    private int price;
    private Key key;
    private int currentSpeed = 0;

    public Car(String name, int price, Key key) {
        this.name = name;
        this.price = price;
        this.key = key;
    }

    public final void turnOn() {
        System.out.println(key.getKeyName() + "로 " + name + "의 시동을 켭니다.");
    }
    public final void turnOff() {
        System.out.println(name + "의 시동을 끕니다.");
    }

    public String getName() {
        return name;
    }
    void sayHello(String getName, int repeatCount){
        for (int i = 0; i < repeatCount; i++) {
            System.out.println("안녕~~방가워~~" + getName);
        }
    }

    public final String info() { // 서브클래스에서 toString 내부로 호출할 메소드. toString 자체는 암시적으로 호출된 상태이므로 명시할 필요 없이 서브클래스에만 구현.
        return "이름 : " + name
                + "\n단가 : " + price + "원"
                + "\n열쇠 타입 : " + key
                + "\n한글 이름 : " + key.getKeyName();
    }
    @Override
    public void speedUp(int su){
        currentSpeed += su;
        checkSpeed(); // 과속 여부 확인
    }
    @Override
    public void speedDown(int su){
        currentSpeed -= su;
        checkSpeed();
    }
    public final void checkSpeed(){
        if (currentSpeed > Speed.ALLOWED_MAX_SPEED) {
            currentSpeed = Speed.ALLOWED_MAX_SPEED;
            System.out.println(Speed.ALLOWED_MAX_SPEED + "km 이상 과속하지 마세요.");
        }
    }
    @Override
    public void display(){// 그랜저에서만 오버라이딩할거
        System.out.println(name + "의 현재 속도 : " + currentSpeed + "(km)");
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }
}
