package ch01_variable_operator;

public class AreaTest {
    public static void main(String[] args) {
        double rad = 10.0, pi = 3.14;

        double a = pi * rad * rad;
        System.out.println("반지름이 " + rad + "일 때 " + "원의 면적은 " + a + "입니다.");

        double b = 4/3 * pi * Math.pow(rad,3);
        System.out.println("반지름이 " + rad + "일 때 " + "구의 부피는 " + b + "입니다.");
    }
}
