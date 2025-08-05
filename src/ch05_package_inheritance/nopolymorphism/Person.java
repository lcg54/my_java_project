package ch05_package_inheritance.nopolymorphism;

public class Person {
    private String name;
//    private Avante avante;
//    private Sonata sonata;
//    private Grandeur grandeur;
//    클래스 객체명; 객체생성(new)은 Main 클래스에서 했음. ride 메소드로 받아온 매개변수를 this로 여기 변수에 저장. 근데 이 문제에선 저장할 필요가 없긴함

    public Person(String name) {
        this.name = name;
    }

    public void ride(Avante avante) { // 클래스 객체 // 반환타입 변수
        //this.avante = avante;
        System.out.println("차주 : " + name);
        System.out.println(avante.superInfo());
        System.out.println(avante.subInfo());
        System.out.println(avante.calcTax());
        System.out.println("========================");
    }

    public void ride(Sonata sonata) {
        //this.sonata = sonata;
        System.out.println("차주 : " + name);
        System.out.println(sonata.superInfo());
        System.out.println(sonata.subInfo());
        System.out.println(sonata.calcTax());
        System.out.println("========================");
    }

    public void ride(Grandeur grandeur) {
        //this.grandeur = grandeur;
        System.out.println("차주 : " + name);
        System.out.println(grandeur.superInfo());
        System.out.println(grandeur.subInfo());
        System.out.println(grandeur.calcTax());
        System.out.println("========================");
    }
}
