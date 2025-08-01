package ch04_class;

import java.util.Scanner;

public class Saram04 {
    private String name, hobby, blood;
    private double height, weight;

    Scanner scan = null; // 스캔 선언

    // public 반환타입 이름(매개변수){...}
    public Saram04(){
    // 생성자는 반환타입이 불필요
    // 개발자가 생성자를 직접 만들면 기존 생성자는 삭제
        this.name = "김철수";
        scan = new Scanner(System.in); // 변수 스캔을 생성자에서 초기화시킴
    }

    public Saram04(String name, double height, double weight, String hobby, String blood) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hobby = hobby;
        this.blood = blood;
    }

    public Saram04(String name, double height, double weight, String blood) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hobby = "볼링";
        this.blood = blood;
    }

    public void display() {
        System.out.println("이름 : " + this.name);
        System.out.println("키 : " + this.height);
        System.out.println("몸무게 : " + this.weight);
        System.out.println("취미 : " + this.hobby);
        System.out.println("혈액형 : " + this.blood);
/*
        if (scan == null){
            System.out.print("점수 입력 : ");
            int su = this.scan.nextInt();
            System.out.println("입력된 점수 : " + su);
        }
*/
    }
}
