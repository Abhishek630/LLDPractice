package OopsBoosterDay2;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return this.getBaseSalary()+calculateBonus();
    }

    private double calculateBonus(){
        if(this.getBaseSalary() > 30000) {
            return this.getBaseSalary()*0.5;
        }
        return this.getBaseSalary() * 0.3;
    }
}
