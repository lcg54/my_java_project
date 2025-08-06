package ch06_abstract_interface.myshape;

public class ShapeMain {
    public static void main(String[] args) {
        Shape[] shape = {
                new Triangle("yellow", "black", 15.0, 10.0),
                new Rectangle("red", "green", 20.0, 10.0),
                new Circle("pink", "blue", 5.0, 3.0, 4.0)
        };
        for (int i = 0; i < shape.length; i++) {
            shape[i].display();
            shape[i].draw();
            System.out.println();
        }
        //해당 메소드가 부모 클래스와 자식 클래스에 모두 구현되어 있다면, 자식 클래스에서 오버라이딩 된 메소드를 읽게 되므로 다운캐스팅이 불필요.
    }
}
