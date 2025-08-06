package ch06_abstract_interface.myshape;

public class Rectangle extends Shape{
    private double width, height;

    public Rectangle(String linecolor, String fillcolor, double width, double height) {
        super(linecolor, fillcolor);
        this.width = width;
        this.height = height;
    }

    public double calcArea(){
        return width*height;
    }
    public double calcPerimeter(){
        return 2*(width+height);
    }
    public void display(){
        System.out.println("사각형 정보");
        System.out.println("면적 : " + calcArea());
        System.out.println("둘레 : " + calcPerimeter());
    }
}
