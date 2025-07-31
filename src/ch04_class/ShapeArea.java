package ch04_class;

public class ShapeArea {
    static final double PI = 3.14;

     void area(int rad) {
        System.out.println(rad*rad*PI);
    }
     void area(int width, int h) {
        System.out.println(width*h);
    }
     void area(int top,int bottom,int width) {
        System.out.println((top+bottom)*width/2.0);
    }
}
