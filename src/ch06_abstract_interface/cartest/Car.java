package ch06_abstract_interface.cartest;

public abstract class Car implements Speed, Display {
    private String name;
    private int price;
    private Key keyType;
    private String keyName;
    private int currentSpeed = 0;

    public Car(String name, int price, Key keyType) {
        this.name = name;
        this.price = price;
        this.keyType = keyType;
    }

    public final void turnOn() {
        String keyName = "";
        switch (keyType){
            case KEY : keyName = "열쇠키"; break;
            case SMART : keyName = "스마트키"; break;
        }
        System.out.println(keyName + "로 " + name + "의 시동을 켭니다.");
        this.keyName = keyName;
    }
    public final void turnOff() {
        System.out.println(name + "의 시동을 끕니다.");
    }

    public String getName() {
        return name;
    }

    public abstract void sayHello(String getName, int repeatCount); // 굳이 getName 으로 받으래서 서브클래스에 구현하는것

    public final String info() { // 서브클래스에서 toString 내부에 호출. toString 자체는 암시적으로 호출된 상태이므로 명시할 필요 없이 서브클래스에만 구현.
        return "이름 : " + name
                + "\n단가 : " + price + "원"
                + "\n열쇠 타입 : " + keyType
                + "\n한글 이름 : " + keyName ;
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
    public void checkSpeed(){ // 그랜저에서만 오버라이딩할거
        if (currentSpeed > Speed.ALLOWED_MAX_SPEED) {
            currentSpeed = Speed.ALLOWED_MAX_SPEED;
            System.out.println(Speed.ALLOWED_MAX_SPEED + "km 이상 과속하지 마세요.");
        }
    }
    @Override
    public void display(){
        System.out.println(name + "의 현재 속도 : " + currentSpeed + "(km)");
    }
}
