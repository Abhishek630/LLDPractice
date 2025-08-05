package OopsBoosterDay2;

public class PartTimeEmployee extends  Employee{

    private final int hoursWorked;
    private final double hourlyRate;


    public PartTimeEmployee(int id, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(id, name, baseSalary);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return getHourlyRate()* getHoursWorked();
    }
}
