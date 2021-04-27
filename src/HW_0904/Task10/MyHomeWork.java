package HW_0904.Task10;

public class MyHomeWork {
    public static void main (String[] args){
        Employee employeeOne = new Employee("Dan", 36, 'm', 100);
        Employee employeeSecond = new Employee("Shon", 43, 'm', 320);
        Employee employeeThird = new Employee("Julia", 41, 'f', 350);
        Manager manager = new Manager("Diana", 38, 'f', 330, 5);



        System.out.println("Salary of employee per year:  " + employeeOne.getSalary(MonthUtils.monthArray));
        System.out.println("Salary of employee per Jan:  " + employeeOne.getSalary(new Month[]{MonthUtils.first}));
        System.out.println("______________________________________");

        System.out.println("Salary of manager per year:  " + manager.getSalary(MonthUtils.monthArray));
        System.out.println("Salary of manager per Jan:  " + manager.getSalary(new Month[] {MonthUtils.first}));


//
//


    }
}
