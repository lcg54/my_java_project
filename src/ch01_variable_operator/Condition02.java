package ch01_variable_operator;

public class Condition02 {
    public static void main(String[] args) {
        int a = 7, b = 4;
        int result = a>=b ? 5 : a+2; // a가 크면 5, 작으면 +2
        System.out.println(result);

        int x = 5;
        result = x%2==0 ? x+3 : x*x; // 짝수면 +3, 홀수면 제곱
        System.out.println(result);

        x = 8; int y = 4;
        result = x>y ? x : y; // 둘 중에 큰 수
        System.out.println(result);

        x = 5; y = 12;
        String str = y%x==0 ? "yes" : "no"; // x가 y의 약수인가?
        System.out.println(str);
    }
}
