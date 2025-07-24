package ch01_variable_operator;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 3, b =5;
        int result = a >= b ? a-b : b-a; // a와 b의 차의 절댓값
        System.out.println("절댓값 : " + result);
    }
}
