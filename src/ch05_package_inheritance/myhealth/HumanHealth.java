package ch05_package_inheritance.myhealth;

public class HumanHealth {
    public static void main(String[] args) {
        Health hong = new Health("홍길동", "M", 175.3, 95.45);
        Health park = new Health("박영희", "F", 162.3, 52.45);

        hong.output2();
        park.output2();
    }
}
