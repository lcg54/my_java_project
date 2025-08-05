package ch05_package_inheritance.nopolymorphism;

public class CarMain {
    public static void main(String[] args) {
        Person[] person = {
                new Person("김철수"),
                new Person("박영희"),
                new Person("최민식")
        };
        Car[] car = {
                new Avante("아반떼", 100, "가장 많은 판매"),
                new Sonata("소나타", 200, "Hyundai"),
                new Grandeur("그랜져", 300, 24.1)
        };
        for (int i = 0; i < car.length; i++) {
            if (car[i] instanceof Avante avante){
                person[i].ride(avante);
            }else if (car[i] instanceof Sonata sonata) {
                person[i].ride(sonata);
            }else if (car[i] instanceof Grandeur grandeur) {
                person[i].ride(grandeur);
            }
        }
    }
}
