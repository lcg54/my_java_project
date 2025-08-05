package ch05_package_inheritance.nopolymorphism;

public class Avante extends Car{
    private String comment;

    public Avante(String name, int price, String comment) {
        super(name, price);
        this.comment = comment;
    }
    public String subInfo(){
        return "코멘트 : " + comment;
    }
}
