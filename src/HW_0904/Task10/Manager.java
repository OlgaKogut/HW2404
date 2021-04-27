package HW_0904.Task10;

public class Manager extends Employee {
    private int empCount;

    public Manager(String name, int age, char sex, int salaryPerDay, int empCount) {
        super(name, age, sex, salaryPerDay);
        this.empCount = empCount;
    }

    public int getEmpCount() {
        return empCount;
    }

    public void setEmpCount(int empCount) {
        this.empCount = empCount;
    }

    @Override
    public int getSalary(Month[] monthArray) {
        return super.getSalary(monthArray) + (int)(super.getSalary(monthArray) * this.empCount / 100.0);
    }
}
