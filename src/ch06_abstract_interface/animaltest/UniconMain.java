package ch06_abstract_interface.animaltest;

public class UniconMain {
    public static void main(String[] args) {
        Unicon unidol = new Unicon("유니돌", "M", "당근");
        unidol.display();
        System.out.println();
        Unicon unisoon = new Unicon("유니순", "F", "건초");
        unisoon.display();
    }
}
