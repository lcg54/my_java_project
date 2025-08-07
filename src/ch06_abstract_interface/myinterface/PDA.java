package ch06_abstract_interface.myinterface;

public class PDA {
    public double calculate(String operator, double x, double y) {
        double result = 0;
        switch (operator) {
            case "*":
                result = x * y;
                break;
            case "#":
                result = 0.0;
                System.out.println(operator + "은(는) 잘못된 연산자입니다.");
                break;
        }
        return result;
    }
}
