package OopsBoosterDay2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManager {

    private final List<Employee> employees;

    public EmployeeManager(List<Employee> employees) {
        this.employees = employees;
    }

    public void printEmployeeList(){
        for(Employee employee : employees){
            System.out.println(employee);
        }
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public Employee findById(int id){
        return employees.stream()
                .filter(emp -> emp.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
    }

    @Override
    public String toString() {
        return "EmployeeManager{" +
                "employees=" + employees +
                '}';
    }

    public double calculateTotalPayroll(){
        return  employees.stream()
                .mapToDouble(Employee::calculateSalary)
                .sum();
    }

    public List<Employee> getAllEmployeesSortedBySalary() {
        return employees.stream()
                .sorted(Comparator.comparingDouble(Employee::calculateSalary))
                .toList();
    }
}
