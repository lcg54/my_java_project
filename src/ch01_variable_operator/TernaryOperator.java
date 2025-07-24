package ch01_variable_operator;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 3, b =5;
        int result = a >= b ? a-b : b-a; // a와 b의 차의 절댓값
        System.out.println("절댓값 : " + result);

        int x = 5;
        result = x%2==0 ? x+3 : x*x; // 짝수면 +3, 홀수면 제곱
        System.out.println(result);

        x = 8; int y = 4;
        result = x>y ? x : y; // 둘 중에 큰 수
        System.out.println(result);

        result = x>y ? y : x; // 둘 중에 작은 수
        System.out.println(result);

        x = 5; y = 12;
        String str = y%x==0 ? "yes" : "no"; // x가 y의 약수인가?
        System.out.println(str);

        int su = 7;
        str = su%2!=0 ? "홀수" : "짝수";
        String msg = "숫자 " + su + "은(는) " + str + "입니다.";
        System.out.println(msg);

        int score = 85;
        str = score>=60 ? score + "점이므로 합격입니다." : score + "점이므로 불합격입니다.";
        System.out.println(str);

        int pw = 9999;
        str = pw==9999 ? "로그인 성공" : "실패";
        System.out.println(str);

        int num = -10;
        // 이중 삼항연산자 - 0보다 클때, 작을때, 0일때
        str = num>0 ? "양수" : num==0 ? "0" : "음수";
        System.out.println(str);

        int grade = 82;
        // 90점 이상 A힉점, 80 B, 나머지 C
        str = grade>=90 ? "A학점" : grade>=80 ? "B학점" : "C학점";
        System.out.println(str);

        int age = 19;
        boolean hasID = true;
        boolean isMember = false;
        // 20세 이상이고 신분증이 있으면 입장가능, 회원이면 입장가능. 얘가 입장이 가능한가?
        str = age>=20 && hasID ? "입장 가능" : isMember ? "입장 가능" : "입장 불가";
        System.out.println(str);
    }
}
