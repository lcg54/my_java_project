package ch04_class;

public class SaramMain04 {
    public static void main(String[] args) {
        //김철수
        Saram04 soo = new Saram04();
        soo.display();

        //박영희
        Saram04 hee = new Saram04("박영희",162.5,52.5,"퀼트","AB");
        hee.display();

        //김유신
        Saram04 yusin = new Saram04("김유신", 175.5, 78.5, "0");
        yusin.display();
    }
}
