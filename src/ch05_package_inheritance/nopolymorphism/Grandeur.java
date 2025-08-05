package ch05_package_inheritance.nopolymorphism;

public class Grandeur extends Car{
    private double fuel;


    public Grandeur(String name, int price, double fuel) {
        super(name, price);
        this.fuel = fuel;
    }

    public String subInfo(){
        String message = "";
        if(fuel>=20){
            message = "excellent";
        }else if(fuel<15){
            message = "poor";
        }else {
            message = "good";
        }
        return "연비 : " + fuel +
                "\n연비 멘트 : " + message;
    }
}
