package ch02_control_statement;

public class ForInFor {
    public static void main(String[] args) {
        System.out.println("\n[ 구구단 표 ]");
        for (int i = 2; i <= 9; i++) {
            System.out.print(+ i + "단 :  ");
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + " * " + j + " = " + i*j + "   ");
            }
            System.out.println();
        }
    }
}
