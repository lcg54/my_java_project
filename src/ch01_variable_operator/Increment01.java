package ch01_variable_operator;

public class Increment01 {
    public static void main(String[] args) {
        int x = 5;

        x += 3; // x = x + 3
        System.out.println("x : " + x);

        x *= 4;
        System.out.println("x : " + x);

        x %= 5;
        System.out.println("x : " + x);

        x -= 1;
        System.out.println("x : " + x);

        x += 7;
        System.out.println("x : " + x);




        int total = 1, a = 1;
        total += ++a; // 1+2
        total += ++a; // "+3
        total += ++a;
        total += ++a;
        total += ++a;
        total += ++a;
        total += ++a;
        total += ++a;
        total += ++a; // "+10
        System.out.println("1부터 10까지의 합은 " + total + "입니다.");
    }
}
