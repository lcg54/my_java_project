package ch05_package_inheritance.mysalary;

public class Salary extends Employee{
    private String department;
    private double payment = 3000;

    public Salary(String name, double payment, String department) {
        super(name);
        this.payment = payment;
        this.department = department;
    }
    public Salary(String name, String department) {
        super(name);
        this.department = department;
    }

    public double getSalary() {
        double salary;
        switch (department) {
            case "영업", "판매":
                salary = payment * 15;
                break;
            default:
                salary = payment * 12;
        }
        return salary;
    }

    public void display() {
        super.display();
        System.out.print(department + "), ");
        System.out.println("급여 : " + payment + ", 연봉 : " + getSalary());
    }
}
