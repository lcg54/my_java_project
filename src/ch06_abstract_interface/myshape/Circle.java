package ch06_abstract_interface.myshape;

public class Circle extends Shape{
    private double radius;
    private double cir1;
    private double cir2;
    private final double PI = 3.141592;

    public Circle(String linecolor, String fillcolor, double radius, double cir1, double cir2) {
        super(linecolor, fillcolor);
        this.radius = radius;
        this.cir1 = cir1;
        this.cir2 = cir2;
    }

    public double calcArea(){
        return PI*radius*radius;
    }
    public double calcPerimeter(){
        return 2*PI*radius;
    }
    public void display(){
        System.out.println("원 정보");
        System.out.println("면적 : " + String.format("%.3f",calcArea()));
        System.out.println("둘레 : " + String.format("%.3f",calcPerimeter()));
        System.out.println("원 중심 : (" + cir1 + ", "+ cir2 + "), 반지름 : " + radius);
    }
}
