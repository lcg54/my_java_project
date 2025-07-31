package ch04_class;

public class ShapeArea {
    final double PI = 3.141593;

    public void area(int a) {
        System.out.println(a*a*PI);
    }
    public void area(int a, int b) {
        System.out.println(a*b);
    }
    public void area(int a,int b,int c) {
        System.out.println((a+b)*c/2.0);
    }
}
