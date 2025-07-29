package ch02_control_statement;

import java.util.Scanner;

public class Ans26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int answer = 55;
        int i = 0;
        while (true){
            System.out.print("1부터 100 사이의 정수를 1개 입력하세요. : ");
            int su = scan.nextInt();
            i++;
            if (su > answer){
                System.out.println(su + "보다 작은 수입니다.");
                System.out.println();
            } else if (su < answer){
                System.out.println(su + "보다 큰 수입니다.");
                System.out.println();
            } else {
                System.out.println("정답입니다.");
                System.out.println(i + "번 시도하여 맞추었습니다.");
                break;
            }
        }
        scan.close();
    }
}
