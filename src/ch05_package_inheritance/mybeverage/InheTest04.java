package ch05_package_inheritance.mybeverage;

public class InheTest04 {
    public static void main(String[] args) {
        Americano04 americano = new Americano04("아메리카노", 4000.0, 250.0);
        /*
        승급 : 서브클래스가 일시적으로 슈퍼클래스의 타입으로 변환이 되는 과정
        Beverage04 beverage01 = new Americano04("아메리카노", 4000.0, 250.0);
        승급시 서브클래스 내의 변수와 메소드는 일시적으로 접근 불가
        단, 강등을 하게 되면 서브클래스 내의 변수와 메소드에 접근 가능
        Americano04 americano = (Americano04)beverage01
        */
        Espresso04 espresso = new Espresso04("에스프레소", 5000.0, 2);
        Latte04 latte = new Latte04("라떼", 6000.0, "아몬드 우유");
        Beverage04 mypresso = new Espresso04("마이뿌레소", 2000.0, 1);
        Beverage04 banana = new Latte04("latte", 3000.0, "바나나 우유");
        // *** myprosso와 banana는 승급(업캐스팅)했으므로 자식클래스의 메소드에 접근이 불가능하지만, display 메소드를 오버라이딩 했으므로 자식 클래스의 display가 출력.

        americano.display();
        espresso.display();
        latte.display();
        mypresso.display();
        banana.display();
    }
}
