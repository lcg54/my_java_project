package ch04_class;

public class Saram02 {
    //스태틱 변수 = 클래스 변수 = 정적 변수
    static String nationality = "대한민국";

    //멤버 변수 (인스턴스 변수)
    String name;
    double height;
    double weight;
    String hobby;
    String blood;

    final double PI = 3.14;  // final 붙이면 변수가 아닌 상수 (constant)
    // 메소드나 클래스 앞에도 붙임


    public void display() {  // 멤버 메소드
        int total = 0;  // 지역 변수
        for (int i = 1; i < 11; i++) {
            total +=1;
        }
        System.out.println("총합 : " + total);
        System.out.println("국적 : " + nationality);
        System.out.println("이름 : " + name);
        System.out.println("키 : " + height);
        System.out.println("몸무게 : " + weight);
        System.out.println("취미 : " + hobby);
        System.out.println("혈액형 : " + blood);
    }
}
