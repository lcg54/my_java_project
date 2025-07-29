package ch02_control_statement;

public class While02 {
    public static void main(String[] args) {
        int odd = 0, even = 0;
        int i = 1;  // 초기식
        while (i<=10){  // 조건식
            if (i%2!=0){odd += i;}
            else {even += i;}
            i++;  // 증감식
        }
        System.out.println("홀수의 총합 : " + odd);
        System.out.println("짝수의 총합 : " + even);
    }
}
