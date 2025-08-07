package ch06_abstract_interface.cartest;

public class Avante extends Car {
    private String comment;

    public Avante(String name, int price, Key key, String comment) {
        super(name,price,key);
        this.comment = comment;
    }
    @Override
    public void sayHello(String getName, int repeatCount){
        for (int i = 0; i < repeatCount; i++) {
            System.out.println("안녕~~방가워~~" + getName);
        }
    }
    @Override
    public String toString() {
        return info() + "\n코멘트 : " + comment;
    }
}
