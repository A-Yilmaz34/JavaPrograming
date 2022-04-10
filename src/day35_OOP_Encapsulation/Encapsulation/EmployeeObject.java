package day35_OOP_Encapsulation.Encapsulation;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("",'Q', 33,50000);

        employee1.setAge(32);
        System.out.println(employee1);

        Employee employee2 = new Employee("Aygun", 'F', 31, 115000);
        employee2.setName("Elvira");

        employee2.setSalary(employee2.getSalary() + 1500);

        System.out.println(employee2);











    }
}
