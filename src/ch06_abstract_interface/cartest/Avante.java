package ch06_abstract_interface.cartest;

public class Avante extends Car {
    private String comment;

    public Avante(String name, int price, Key key, String comment) {
        super(name,price,key);
        this.comment = comment;
    }
    @Override
    public String toString() {
        return info() + "\n코멘트 : " + comment;
    }
}
