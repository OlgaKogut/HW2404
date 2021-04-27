package HW_0904.Task11;

public class EmployeeMethod {


    public static Employee findByName(String name, Employee[] employeeArray){
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].equals(name)) {
                return employeeArray[i];
            }
        }
        return null;
    }

    public static Employee findByString(String str, Employee[] employeeArray) {
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getName().contains(str)) {
                return employeeArray[i];
            }
        }
        return null;
    }

    public static int totalSalary(Employee[] employeeArray) {
        int sum = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            sum += employeeArray[i].getSalary();
        }
        return sum;
    }

    public static Employee maxSalary(Employee[] employeeArray) {
        int max = Integer.MIN_VALUE;
        Employee emp = employeeArray[0];
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getSalary() > max) {
                max = employeeArray[i].getSalary();
                emp = employeeArray[i];
            }
        }
        return emp;
    }

    public static Employee minSalary(Employee[] employeeArray) {
        int min = Integer.MAX_VALUE;
        Employee emp = employeeArray[0];
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getSalary() < min) {
                min = employeeArray[i].getSalary();
                emp = employeeArray[i];
            }
        }
        return emp;
    }

    public static Manager maxCountSubordinates(Manager[] managerArray) {
        int max = Integer.MIN_VALUE;
        Manager manager = managerArray[0];
        for (int i = 0; i < managerArray.length; i++) {
            if (managerArray[i].getNumberOfSubordinates() > max) {
                max = managerArray[i].getNumberOfSubordinates();
                manager = managerArray[i];
            }
        }
        return manager;
    }

    public static Manager minCountSubordinates(Manager[] managerArray) {
        int min = Integer.MAX_VALUE;
        Manager manager = managerArray[0];
        for (int i = 0; i < managerArray.length; i++) {
            if (managerArray[i].getNumberOfSubordinates() < min) {
                min = managerArray[i].getNumberOfSubordinates();
                manager = managerArray[i];
            }
        }
        return manager;
    }

    public static Manager maxAddSalary(Manager[] managerArray){
        int max = Integer.MIN_VALUE;
        Manager manager = managerArray[0];
        for (int i = 0; i < managerArray.length; i++) {
            if (managerArray[i].getSalary() - managerArray[i].getBaseSalary() > max) {
                max = managerArray[i].getSalary() - managerArray[i].getBaseSalary();
                manager = managerArray[i];
            }
        }
        return manager;
    }

    public static Manager minAddSalary(Manager[] managerArray){
        int min = Integer.MAX_VALUE;
        Manager manager = managerArray[0];
        for (int i = 0; i < managerArray.length; i++) {
            if (managerArray[i].getSalary() - managerArray[i].getBaseSalary() < min) {
                min = managerArray[i].getSalary() - managerArray[i].getBaseSalary();
                manager = managerArray[i];
            }
        }
        return manager;
    }

}
