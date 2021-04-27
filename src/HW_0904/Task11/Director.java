package HW_0904.Task11;

public class Director extends Manager{

    public Director(int baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }

    @Override
    public int getSalary() {
        return super.getBaseSalary() + super.getBaseSalary() * this.getNumberOfSubordinates() / 100 * 9;
    }
}
