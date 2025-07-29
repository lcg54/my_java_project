package ch02_control_statement;

public class While01 {
    public static void main(String[] args) {

        int total = 0;
        int i = 1;  // 초기식;
        while (i < 11) {  // while(조건식)
            total += i;  // 반복문
            i++;  // 증감식;
        }
        System.out.println("총합 01 : " + total);
        // for 구문과 비교하면
        total = 0;
        for (int j = 1; j < 11; j++) {  // for(초기식; 조건식; 증감식)
            total += j;  // 반복문
        }

        total = 0;
        i = 1;
        while (i <= 100) {total += i;i += 3;}
        System.out.println("총합 02 : " + total);

        total = 0;
        i = 97;
        while (i > 1) {total += i;i -= 5;}
        System.out.println("총합 03 : " + total);

        total = 0;
        i = 1;
        while (i <= 96) {total += i*i;i += 5;}
        System.out.println("총합 04 : " + total);

        total = 0;
        i = 1;
        while (i <= 5) {total += i*(i+1);i ++;}
        System.out.println("총합 05 : " + total);
    }
}
