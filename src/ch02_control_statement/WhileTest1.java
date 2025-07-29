package ch02_control_statement;

public class WhileTest1 {
    public static void main(String[] args) {
        int su = 3;
        int i = 0;
        while (i<9){
            i++;
            System.out.println(su + " * " + i + " = " + su*i);
        }
    }
}
