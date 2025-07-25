package ch01_variable_operator;

public class Casting {
    public static void main(String[] args) {

        double d = 100; // 암시적 형변환
        System.out.println("d : " + d);

        int i = (int)12.5; // 명시적 형변환
        System.out.println("i : " + i);

        System.out.println(14/5); // 2(산술)
        System.out.println((double)14/5); // 14.0(명시적) -> 5.0(암시적) -> 2.8
        System.out.println((double)(14/5)); // 2(산술) -> 2.0(명시적)

        int kor = 50, eng = 60, math = 80;
        int total = kor + eng + math;
        double avg = (double)total/3; // 190.0(명시) -> 3.0(암시) -> 63.333
        System.out.println("총점 : " + total);
        System.out.println("평균 : " + avg);

        char ch1 = 'c', ch2 = 'a';
        boolean bool1 = ch1 > ch2; // 99(암시) > 97(암시) -> true
        System.out.println("bool1 : " + bool1);

        int result = ch1 - ch2 + 5;
        System.out.println("result : " + result);

        char ch3 = 'D';
        String str = ch3>='A' && ch3<='Z' ? "yes" : "no"; // 대문자인가 = A~Z 사이에 있는가
        System.out.println("대문자 판단 : " + str);
    }
}
