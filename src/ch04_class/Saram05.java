package ch04_class;

public class Saram05 {
    private String name, blood;
    private String hobby = "축구";
    // 생성자를 통하여 입력하지 않으면 기본값으로 "축구"가 할당됨
    private double height, weight;

    public Saram05(String name, double height, double weight, String hobby, String blood) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hobby = hobby;
        this.blood = blood;
    }

    public Saram05(String name, double height, double weight, String blood) {
        this.name = name;
        this.blood = blood;
        this.height = height;
        this.weight = weight;
    }
    //반환타입 void는 String, int, boolean 처럼 정해진 타입의 값을 외부로 반환(return)하지 못한다. 클래스 내에서의 저장에는 제한이 없으며, display의 경우 외부클래스이긴 하나 반환 개념이 아닌 출력 개념이므로 (sout와 같은) 해당 값을 가공할 수 없으므로 void display는 성립한다.
    public void display() {
        System.out.println("이름 : " + this.name);
        System.out.println("키 : " + this.height);
        System.out.println("몸무게 : " + this.weight);
        System.out.println("취미 : " + this.hobby);
        System.out.println("혈액형 : " + this.blood);
    }
}
