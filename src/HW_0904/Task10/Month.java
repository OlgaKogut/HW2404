package HW_0904.Task10;

public class Month {
    private String month;
    private int dayCount;
    private int workDayCount;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getDayCount() {
        return dayCount;
    }

    public void setDayCount(int dayCount) {
        this.dayCount = dayCount;
    }

    public int getWorkDayCount() {
        return workDayCount;
    }

    public void setWorkDayCount(int workDayCount) {
        this.workDayCount = workDayCount;
    }

    public Month(String month, int dayCount, int workDayCount) {
        this.month = month;
        this.dayCount = dayCount;
        this.workDayCount = workDayCount;
    }
}
