package ch01_variable_operator;

public class Add {
    public static void main(String[] args) {
        //변수를 선언(정의)
        int x; // 정수형 데이터를 위하여 변수 x를 준비해주세요.
        int y;
        int z;

        x = 3; // x라는 곳에 숫자 3을 할당(대입)해주세요.(write)
        y = 5;
        z = x + y;

        String message; // 문자열형 데이터를 위하여 변수 message를 준비해주세요.

        // + 기호의 두가지 역할: (1) 덧셈 (2) 문자열 결합
        message = x + " 더하기 " + y + "는 " + z + "입니다.";
        System.out.println(message);

        x = 4; // 야 너 3이지, 없애고 4로 치환해
        y = 8;
        z = x * y;

        message = x + " 곱하기 " + y + "은(는) " + z + "입니다.";
        System.out.println(message);
    }
}
