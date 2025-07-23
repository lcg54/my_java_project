package ch01_variable_operator;

public class MyBox {
    public static void main(String[] args) {
        double w = 10.0, h = 5.0;
        double x = Math.sqrt(Math.pow(w,2)+Math.pow(h,2)); // 루트함수, 제곱함수

        System.out.println("사각형의 넓이 : " + w*h + "\n사각형의 둘레 : " + (w+h)*2);
        System.out.print("대각선의 길이 : " + Math.round(x)); // 반올림함수
    }
}
