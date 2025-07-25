package ch02_control_statement;

public class AdultCheck {
    public static void main(String[] args) {
        String name = "홍길동";
        int age = 12;
        int _gender = 3;
        String gender;
        String adult;

        if (age >= 19) {
            adult = "성인";
        } else {
            adult = "미성년자";
        }

        if (_gender == 1 || _gender == 3) {
            gender = "남자";
        } else {
            gender = "여자";
        }
        String message;
        message = "이름 : " + name + "님, 나이 : " + age + "세, 성인 체크 : " + adult + ", 성별 : " + gender;
        System.out.println(message);
    }
}
