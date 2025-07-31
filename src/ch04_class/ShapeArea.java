package ch04_class;

public class ShapeArea {
    final double PI = 3.141593;

     void area(int a) {
        System.out.println(a*a*PI);
    }
     void area(int a, int b) {
        System.out.println(a*b);
    }
     void area(int a,int b,int c) {
        System.out.println((a+b)*c/2.0);
    }
}
