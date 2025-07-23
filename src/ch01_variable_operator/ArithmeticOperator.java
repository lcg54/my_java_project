package ch01_variable_operator;

public class ArithmeticOperator {
    public static void main(String[] args) {
        int T = 4000;
        System.out.println(T+"초는 "+T/3600+"시간, "+T/60%60+"분, "+T%60+"초입니다.");
        T = 8000;
        System.out.println(T+"초는 "+T/3600+"시간, "+T/60%60+"분, "+T%60+"초입니다.");
    }
}
