package ch02_control_statement;

import java.util.Scanner;

public class If03 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println();
        int su = a.nextInt();

        if (su % 3 == 0) {
            System.out.println("3의 배수입니다.");
            System.out.println(su * su);
        } else {
            System.out.println("3의 배수가 아닙니다.");
            System.out.println(su + 5);
        }
        a.close();
    }
}
