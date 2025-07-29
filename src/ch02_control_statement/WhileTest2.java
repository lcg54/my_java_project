package ch02_control_statement;

import java.util.Scanner;

public class WhileTest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // 스캐너 장치 준비

        int total = 0, count = 0;
        double avg = 0;
        while (true){
            System.out.print("점수 입력 : ");
            int grade = scan.nextInt(); // 정수 스캔
            if (grade<=0) {
                System.out.println("음수 또는 0이어서 종료합니다.");
                break;
            } else {
            total += grade;
            count++;
            avg = (double) total / count;
            }
        }
        System.out.println("응시횟수 : " + count);
        System.out.println("평균 : " + avg);
        scan.close();
    }
}
