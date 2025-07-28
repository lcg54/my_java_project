package ch02_control_statement;

public class For06 {
    public static void main(String[] args) {

        double total = 0; // 1 + 1/2 + 1/3 + ... + 1/100
        for (int i = 1; i <= 100; i++) {
            total += (double)1 / i;
        }
        System.out.println("총합 : " + total);

        total = 0; // 0/1 + 1/2 + 2/3 + ... + 99/100
        for (int i = 1; i <= 100; i++) {
            total += (double)(i-1) / i;
        }
        System.out.println("총합 : " + total);

        total = 0; // 2/1 + 3/2 + 4/3 + ... + 101/100
        for (double i = 1; i <= 100; i++) {
            total += (i+1) / i;  // 앞서 i를 double로 정의하여 명시적 형변환 불필요
        }
        System.out.println("총합 : " + total);
    }
}
