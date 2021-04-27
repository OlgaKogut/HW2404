package HW_0304;

public class Employee {
    String fistName;
    String lastName;
    int age;
    String sex;
    int salary;

    public Employee(String fistName, String lastName, int age, String sex, int salary) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
    }

    public boolean isSameName(Employee employee){
        String name = this.fistName;
        String lName = this.lastName;
        return (name == employee.fistName && lName == employee.lastName);
    }

}
