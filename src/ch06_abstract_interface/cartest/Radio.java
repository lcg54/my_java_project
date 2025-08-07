package ch06_abstract_interface.cartest;

public interface Radio {
    static void play(Frequency frequency, double channel){
        System.out.println("라디오 " + frequency + "채널 : " + channel +"을(를) 재생합니다.");
    }
    // static 메소드 : final 메소드와 마찬가지로 '클래스명(=인터페이스명).메소드명()' 으로 호출하며, 오버라이딩 불가. 차이점은 static의 경우 상속되지 않으며 클래스와 인터페이스 모두 사용 가능하나, final의 경우 상속되며 클래스에서만 사용 가능하다.
    //명시했듯 상속되지 않으므로 따로 호출해서 사용한다.

    // 마찬가지로 인터페이스에서 구현 가능한 default 메소드의 경우 예외적으로 부모클래스의 호출방법(super.메소드영())과 마찬가지로 '인터페이스명.super.메소드명()'으로 호출이 가능하며, 오버라이딩이 가능하고, 강제하지 않음.
}
