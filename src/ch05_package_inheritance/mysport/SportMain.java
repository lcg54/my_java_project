package ch05_package_inheritance.mysport;

public class SportMain {
    public static void main(String[] args) {
        FootBall football = new FootBall("축구", 11, 1, 5);
        football.show();

        BaseBall baseball = new BaseBall("야구", 9, 9, 0.412);
        baseball.show();
    }
}
