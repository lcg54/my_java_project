package ch03_array;

public class MyArr02 {
    public static void main(String[] args) {
        int[] a = new int[3];
        for (int i = 0; i < a.length; i++){
            a[i] = 10 * (i + 1);
            System.out.println(a[i]);
        }
        // b : 3, 8, 13, 18, ... , 98
        int[] b = new int[(98-3)/5+1]; // 개수 구하는 공식 = (상한값-하한값)/(증감치의 절대값) + 1
        System.out.print("b : ");
        for (int i = 0; i < b.length; i++) {
            b[i] = 3+5*i;
            System.out.print(b[i]);
            if (i == b.length - 1){break;}
            System.out.print(", ");
        }
        System.out.println();

        // c : 92, 82, 72, ... , 2
        int[] c = new int[(92-2)/10+1];
        System.out.print("c : ");
        for (int i = 0; i < b.length; i++) {
            c[i] = 92-10*i;
            System.out.print(c[i]);
            if (i == c.length - 1){break;}
            System.out.print(", ");
        }
        System.out.println();

        // d : 7, 10, 13, ... , 97
        int[] d = new int[(97-7)/3+1];
        System.out.print("d : ");
        for (int i = 0; i < d.length; i++) {
            d[i] = 7+3*i;
            System.out.print(d[i]);
            if (i== d.length-1){break;}
            System.out.print(", ");
        }
    }
}
