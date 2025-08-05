package ch05_package_inheritance.mysalary;

public class EmpSalary {
    public static void main(String[] args) {
        Employee employee = new Employee("강감찬");
        System.out.println("대표 이사 이름 : " + Employee.ceoname);
/*
        Salary hong = new Salary("홍길동", 10000.0, "영업");
        hong.display();

        Salary hee = new Salary("박영희", 10000.0, "구매") ;
        hee.display();

        Salary soo = new Salary("김철수", "광고") ;
        soo.display();
*/
        Salary[] empList = {
                new Salary("홍길동", 10000.0, "영업"),
                new Salary("박영희", 10000.0, "구매"),
                new Salary("김철수", "광고")
        };
        for (int i = 0; i < empList.length; i++) {
            empList[i].display();
        }

        employee = new Employee(empList.length);
        System.out.println("총 직원 수 : " + Employee.count + "명");

    }
}
