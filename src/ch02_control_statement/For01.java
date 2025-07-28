package ch02_control_statement;

public class For01 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 10; i++) {total += i;} // 1부터 10까지의 합
        System.out.println("총합01 : " + total);

        total = 0; // 초기화
        for (int i = 1; i <= 100; i += 3) {total += i;} // 1 + 4 + 7 + ... + 100
        System.out.println("총합02 : " + total);

        total = 0;
        for (int i = 97; i > 1; i -= 5) {total += i;} // 07 + 92 + 87 + ... + 2
        System.out.println("총합03 : " + total);

        total = 0;
        for (int i = 1; i <= 96; i += 5) {total += i*i;} // 1*1 + 6*6 + ... + 96*96
        System.out.println("총합04 : " + total);

        total = 0;
        for (int i = 1; i < 6; i++) {total += i*(i+1);} // 1*2 + 2*3 + ... + 5*6
        System.out.println("총합05 : " + total);
    }
}
