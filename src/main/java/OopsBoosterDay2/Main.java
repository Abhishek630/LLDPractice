package OopsBoosterDay2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager(new ArrayList<>());

        employeeManager.addEmployee(new FullTimeEmployee(1, "Emp1", 30000));
        employeeManager.addEmployee(new FullTimeEmployee(2,"Emp2", 10000));
        employeeManager.addEmployee(new PartTimeEmployee(3,"Emp3",0,30, 1000));

        employeeManager.printEmployeeList();

        System.out.println(employeeManager.findById(3));
        employeeManager.findById(5);
        System.out.println(employeeManager.calculateTotalPayroll());

        System.out.println(employeeManager.getAllEmployeesSortedBySalary());

    }
}
