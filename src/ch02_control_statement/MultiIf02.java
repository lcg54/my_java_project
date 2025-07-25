package ch02_control_statement;

public class MultiIf02 {
    public static void main(String[] args) {
        int age = 16;
        double ticket = 1000.0;
        double price;
        String announce;

        if (age < 8) {
            announce = "유아(무료 입장)";
            price = 0;
        } else if (age < 14) {
            announce = "어린이(50% 할인)";
            price = ticket * 0.5;
        } else if (age < 20) {
            announce = "청소년(30% 할인)";
            price = ticket * 0.7;
        } else if (age < 65) {
            announce = "성인(정가)";
            price = ticket;
        } else {
            announce = "노인(40% 할인)";
            price = ticket * 0.6;
        }
        System.out.println(age + "살 : " + announce);
        System.out.println("가격은 " + (int) price + "원입니다.");
    }
}
