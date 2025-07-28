package ch02_control_statement;

public class SumTest {
    public static void main(String[] args) {
        int sumA = 0, sumB = 0, sumC = 0;
        for (int i = 1; i <= 10; i++) {
            if (i%3==0){sumA += i;}
            else if (i>=5 && i!=8) {sumB += i;}
            else if (i<=5) {sumC += i;}
        }
        System.out.println("sumA = " + sumA);
        System.out.println("sumB = " + sumB);
        System.out.println("sumC = " + sumC);
    }
}