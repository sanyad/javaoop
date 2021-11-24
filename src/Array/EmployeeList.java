package Array;

import java.util.ArrayList;

public class EmployeeList extends TopAndLowEmployee implements AbstractEmployee {
    private ArrayList<Employee> list = new ArrayList<>();

    @Override
    public void addEmployeeToList() {
        list.add(new Employee("Svetlane", "Kormushina", 25));
        list.add(new Employee("Petro", "Semechkin", 75));
        list.add(new Employee("Dmitry", "Yarushin", 80));
        list.add(new Employee("Sergey", "Petryl", 50));
    }

    @Override
    public void getEmployeeList() {
        Employee lowEmployee = getEmployee(this.list, "low");
        Employee topEmployee = getEmployee(this.list, "high");
        System.out.printf("Employee with low rating is %s %s", lowEmployee.name, lowEmployee.surname);
        System.out.println();
        System.out.printf("Employee with high rating is %s %s", topEmployee.name, topEmployee.surname);
    }

    public EmployeeList() {
        addEmployeeToList();
    }



}
