package ch02_control_statement;

public class For02 {
    public static void main(String[] args) {

        // for/if 구문
        int odd = 0, even = 0;
        for (int i = 1; i <= 10; i++) {
            if (i%2!=0) {odd += i;}
            else {even += i;}
        }
        System.out.println("홀수의 총합 : " + odd);
        System.out.println("짝수의 총합 : " + even);

        // for/switch 구문
        odd = 0; even = 0;
        for (int i = 1; i <= 10; i++) {
            switch (i%2) {
                case 1: odd += i;break;
                case 0: even += i;break;
            }
        }
        System.out.println("홀수의 총합 : " + odd);
        System.out.println("짝수의 총합 : " + even);
    }
}
