package ch02_control_statement;

public class If04 {
    public static void main(String[] args) {
        int score = 62;
        String grade;

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("점수 : " + score);
        System.out.println(grade + " 학점");
    }
}