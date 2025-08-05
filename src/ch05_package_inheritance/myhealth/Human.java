package ch05_package_inheritance.myhealth;

public class Human {
    private String name; // 이름
    private String gender; //성별
    private double height; // 키
    private double weight ; // 몸무게

    public Human(String name, String gender, double height, double weight) {
        this.name = name;
        switch (gender){
            case "M": this.gender = "남자"; break;
            case "F": this.gender = "여자"; break;
        }
        this.height = height;
        this.weight = weight;
    }

    public void output1() {
        System.out.print("이름 : " + name);
        System.out.print(", 성별 : " + gender);
        System.out.print(", 키 : " + height);
        System.out.println(", 몸무게 : " + weight);
    }

    public String getName() {
        return name;
    }
}
