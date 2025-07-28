package ch02_control_statement;

public class For04 {
    public static void main(String[] args) {

        // for/switch 구문
        int su = 3;
        int sum0 = 0, sum1 = 0, sum2 = 0;
        for (int i = 1; i <= 10; i++) {
            switch (i%3){
                case 0: sum0 += i;break;
                case 1: sum1 += i;break;
                case 2: sum2 += i;break;
            }
        }
        System.out.println("sum0 : " + sum0);
        System.out.println("sum1 : " + sum1);
        System.out.println("sum2 : " + sum2);

        // for/if 구문
        sum0 = 0; sum1 = 0; sum2 = 0;
        for (int i = 1; i <= 10; i++) {
            if (i%3==0){sum0 += i;}
            else if (i%3==1){sum1 += i;}
            else {sum2 += i;}
        }
        System.out.println("sum0 : " + sum0);
        System.out.println("sum1 : " + sum1);
        System.out.println("sum2 : " + sum2);
    }
}
