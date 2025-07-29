package ch02_control_statement;

import java.util.Scanner;

public class WhileTest4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int total = 0, count = 0;
        double avg = 0;
        while (true){
            System.out.print("점수 입력 : ");
            int grade = scan.nextInt();
            if (grade < -10) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (grade<0) {
                grade *= -1;
            } else {
            }
            total += grade;
            count++;
            avg = (double) total / count;
        }
        System.out.println("총 시험 빈도(횟수) : " + count);
        System.out.println("총점 : " + total);
        System.out.println("평균 : " + avg);
        scan.close();
    }
}
