package Array;

import java.util.ArrayList;

public class TopAndLowEmployee {
    public Employee getEmployee(ArrayList<Employee> list, String rate) {
        Employee employee = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (rate.equals("low")) {
                if (employee.rate > list.get(i).rate) {
                    employee = list.get(i);
                }
            } else if (rate.equals("high")) {
                if (employee.rate < list.get(i).rate) {
                    employee = list.get(i);
                }
            } else {
                return new Employee();
            }

        }
        return employee;
    }
}
