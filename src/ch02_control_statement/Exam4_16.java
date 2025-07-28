package ch02_control_statement;

public class Exam4_16 {
    public static void main(String[] args) {
        int su = 24;
        for (int i = 1; i <= su; i++) {
            System.out.print("*");
            if (i%7==0){ // i가 7의배수가 될 때마다 Enter
                System.out.println();
            }
        }
    }
}
