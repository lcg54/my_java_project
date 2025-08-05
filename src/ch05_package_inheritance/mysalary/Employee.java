package ch05_package_inheritance.mysalary;

public class Employee {
    static String ceoname;
    static int count;
    private String name;

    public Employee(String ceoname) {
        this.ceoname = ceoname;
    }
    public Employee(int count) {
        this.count = count;
    }

    public Employee(String name, double payment, String department){
        this.name = name;
    }
    public Employee(String name, String department) {
        this.name = name;
    }

    protected void display() {
        System.out.print(name + "(");
    }
}
