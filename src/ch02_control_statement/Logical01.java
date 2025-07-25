package ch02_control_statement;

public class Logical01 {
    public static void main(String[] args) {
        int month = 7;
        String season;

        if (month >= 3 && month <= 11) {
            season = month <= 5 ? "봄" : month <= 8 ? "여름" : "가을";
        } else {
            season = "겨울";
        }
        System.out.printf(month + "월은 " + season + "입니다.");
    }
}
