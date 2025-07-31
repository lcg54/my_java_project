package ch04_class;

public class OverAdd {
    // 변환타입 이름(매개변수){...}
    int Add(int x, int y, int z){
        return x + y + z;
    }

    void Add(int a, int b) {
        System.out.println("정수형 : " + (a+b));
    }

    void Add(double x, double y) {
        System.out.println("실수형 : " + (x+y));
    }

    void Add(int x, double y) {
        System.out.println("혼합형 : " + (x + y));
    }
}
