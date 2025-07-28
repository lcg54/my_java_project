package ch02_control_statement;

public class SumTest02 {
    public static void main(String[] args) {
        int su1 = 3, su2 = 8;
        int total = 0;
        for (int i = su1; i <= su2; i++) {
            if (i%3!=0){total += i;}
        }
        System.out.println("총합 : " + total);
    }
}
