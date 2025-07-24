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




        int total = 0, a = 0;
        while (a < 10){total += ++a;} // 반복문 (1+2+3+...+10)
        System.out.println("1부터 10까지의 합은 " + total + "입니다.");
    }
}
