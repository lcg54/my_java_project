package ch01_variable_operator;

public class CondOper {
    public static void main(String[] args) {
        int x = 3, y = 8, z = 4, max;
        max = x>y ? x : y;
        max = max>z ? max : z;
        System.out.println("max : " + max);
    }
}
