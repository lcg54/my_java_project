package ch02_control_statement;

public class Exam4_18 {
    public static void main(String[] args) {
        int su = 7;
        for (int i = 1; i <= su; i++) {System.out.println(i + "의 제곱은 " + i*i + "입니다.");}

        int su1 = 3, su2 = 7, total = 0;
        for (int i = su1; i <= su2; i++) {total += i;}
        System.out.println(su1 + "부터 " + su2 + "까지의 합 : " + total);
    }
}
