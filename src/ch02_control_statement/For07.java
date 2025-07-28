package ch02_control_statement;

public class For07 {
    public static void main(String[] args) {
        double total = 0;
        for (double i = 1; i <= 100; i++) { // 1 - 1/2 + 1/3 - 1/4 + … + 1/99 - 1/100
            total += i%2==0 ? -1/i : 1/i;
        }
        System.out.println("총합 = " + total);
    }
}
