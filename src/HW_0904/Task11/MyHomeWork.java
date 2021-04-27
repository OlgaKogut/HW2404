package HW_0904.Task11;


import java.util.Objects;

public class MyHomeWork {

    public static void main(String[] args){
        Employee employee = new Employee(1000, "Dan");
        Employee employeeOne = new Employee(1500, "Katrin");

        Manager manager = new Manager(1000, "Ben", 4);
        Manager managerOne = new Manager(3000, "Lily", 10);

        Director director = new Director(900, "Stan", 25);

        Employee[] employeeArray = new Employee[] {employee, employeeOne, manager, managerOne, director};
        Manager[] managerArray = new Manager[] {manager, managerOne, director};

        System.out.println(employee.getSalary());
        System.out.println(managerOne.getSalary());
        System.out.println(director.getSalary());
        System.out.println("----------------------");


        System.out.println("Find: " + (EmployeeMethod.findByString("il", employeeArray)).getName());
        System.out.println("Min Salary: " + (EmployeeMethod.minSalary(employeeArray)).getName());
        System.out.println("Max Salary: " + (EmployeeMethod.maxSalary(employeeArray)).getName());
        System.out.println("Max Add Salary: " + (EmployeeMethod.maxAddSalary(managerArray)).getName());


    }

}
