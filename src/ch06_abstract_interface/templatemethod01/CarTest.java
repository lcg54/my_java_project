package ch06_abstract_interface.templatemethod01;

public class CarTest {
    public static void main(String[] args) {
        System.out.println("=== 자율 주행하는 자동차 ===");
        Car aicar = new AICar();
        aicar.run();
        System.out.println();
        System.out.println("=== 사람이 운전하는 자동차 ===");
        Car micar = new ManualCar();
        micar.run();
    }
}
