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
    public abstract double calcArea();
    public abstract double calcPerimeter();
    public abstract void display();
}
