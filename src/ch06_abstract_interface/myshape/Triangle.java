package ch06_abstract_interface.myshape;

public class Triangle extends Shape {
    private double width, height;

    public Triangle(String linecolor, String fillcolor, double width, double height) {
        super(linecolor, fillcolor);
        this.width = width;
        this.height = height;
    }

    public double calcArea(){
        return width*height/2;
    }
    public double calcPerimeter(){
        return width+height/2;
    }
    public void display(){
        System.out.println("삼각형 정보");
        System.out.println("면적 : " + calcArea());
        System.out.println("둘레 : " + calcPerimeter());
    }

}
