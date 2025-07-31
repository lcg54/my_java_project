package ch04_class;

public class Saram03 {
    private String name;
    private double height;
    private double weight;
    private String hobby;
    private String blood;

    // public 반환타입 메소드이름(매개변수){}
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    // (void) set으로 (객체값을)받고 (+this) -> (메소드) get으로 (객체한테)보냄 (+return)

    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return height;
    }

    public double getWeight() {return weight;}
    public void setWeight(double weight) {this.weight = weight;}

    public String getHobby() {return hobby;}
    public void setHobby(String hobby) {this.hobby = hobby;}

    public String getBlood() {return blood;}
    public void setBlood(String blood) {this.blood = blood;}
}
