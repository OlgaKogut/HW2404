package HW_0304;

public class EmployeeMethod {

    public static void findEmployeeByName(Employee[] employeeArray, String nameEmployee) {
        for (int i = 0; i < employeeArray.length; i ++) {
            if (employeeArray[i].fistName == nameEmployee) {
                System.out.println("Found: " + employeeArray[i].fistName + " " + employeeArray[i].lastName);
            } else {
            }
        }
    }

    public static void findEmployeeByStr(Employee [] employeeArray, String strInName) {
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].fistName.indexOf(strInName) != -1) {
                System.out.println("Found with string: " + employeeArray[i].fistName + " " + employeeArray[i].lastName);
            }
        }
    }

    public static boolean isEmployee(Employee [] employeeArray, String fName, String lName) {
        boolean find = false;
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].fistName == fName && employeeArray[i].lastName == lName) {
                find = true;
                //System.out.println("Found employee: " + employeeArray[i].fistName + " " + employeeArray[i].lastName);
            }
        }
        return  find;
    }

    public static int minSalary(Employee [] employeeArray) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < employeeArray.length; i ++) {
            if (employeeArray[i].salary < min) {
                min = employeeArray[i].salary;
            }
        }
        return min;
    }

    public static int maxSalary(Employee [] employeeArray) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < employeeArray.length; i ++) {
            if (employeeArray[i].salary > max) {
                max = employeeArray[i].salary;
            }
        }
        return max;
    }

}
