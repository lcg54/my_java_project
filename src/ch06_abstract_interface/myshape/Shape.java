package ch06_abstract_interface.myshape;

public abstract class Shape {
    private double area, perimeter;
    private String linecolor, fillcolor;

    public Shape(String linecolor, String fillcolor) {
        this.linecolor = linecolor;
        this.fillcolor = fillcolor;
    }
    public final void draw(){
        System.out.println("라인 색상 : " + linecolor);
        System.out.println("채우기 색상 : " + fillcolor);
    }
    // protected는 같은 패키지 또는 자식 클래스에서만 접근 가능.
    // 일반적으로 추상 클래스에만 사용. 생성자나 final 메소드에도 써도 되긴하는데 유연성때문에 안씀.
    protected abstract double calcArea();
    protected abstract double calcPerimeter();
    protected abstract void display();
}
