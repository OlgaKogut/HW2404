package HW_0304;

public class MyHomeWork {
    public static void main(String[] args){
        Person person1 = new Person("Andy", "Kohut", 36, "male");
        Person person2 = new Person("Katrin", "Kohut", 8, "female");

        System.out.println("Result of Task9_1:");
        person1.getName();
        person2.getName();
        System.out.println("__________________");

        System.out.println("Result of Task9_2:");

        Employee employee_first = new Employee("Stan", "Dou", 40, "male", 5000);
        Employee employee_second = new Employee("Stan", "Braun", 46, "male", 5600);
        Employee employee_third = new Employee("Alex", "Greg", 36, "male", 6000);
        Employee employee_fourth = new Employee("Stan", "Dou", 31, "male", 5300);

        System.out.println(employee_first.isSameName(employee_second));
        System.out.println(employee_first.isSameName(employee_third));
        System.out.println(employee_first.isSameName(employee_fourth));

        System.out.println("__________________");

        System.out.println("Result of Task9_3:");

        System.out.println("Total salary: " + Salary.getSum(new Employee[] {employee_first, employee_second, employee_third, employee_fourth}) + "$");

        System.out.println("__________________");

        System.out.println("Result of TaskB:");

        Employee[] employeeArr = new Employee[]{employee_first, employee_second, employee_third, employee_fourth};
        EmployeeMethod.findEmployeeByName(employeeArr,"Stan");
        System.out.println();

        EmployeeMethod.findEmployeeByStr(employeeArr,"ex");
        System.out.println();

        System.out.println("IsEmployee: " + EmployeeMethod.isEmployee(employeeArr, "Stanly", "Dou"));
        System.out.println();

        System.out.println("Min Salary: " + EmployeeMethod.minSalary(employeeArr));
        System.out.println("Max Salary: " + EmployeeMethod.maxSalary(employeeArr));


        System.out.println("__________________");

    }
}
