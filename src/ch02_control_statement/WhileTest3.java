package ch02_control_statement;

import java.util.Scanner;

public class WhileTest3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("원하는 팩토리얼 값을 입력 : ");
        int su = scan.nextInt();
        int i = su;
        while (true) {
            if (i>1) {
                System.out.print(i + " * ");
                i--;
                su *= i;
            } else {
                break;
            }
        }
        System.out.println(" 1 = " + su);
        scan.close();
    }
}
