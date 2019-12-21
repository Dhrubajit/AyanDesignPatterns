package main.java.Stream;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static List<Employee> employeeRepository() {
		Employee emp1 = new Employee(4, 50000, "Dhruv");
		Employee emp2 = new Employee(1, 150000, "Dhruv2");
		Employee emp3 = new Employee(3, 30000, "Dhruv1");
		Employee emp4 = new Employee(2, 70000, "Dhruv5");

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);

		return empList;
	}

	public static Employee findById(int id) {
		List<Employee> empList = employeeRepository();
		for (Employee e : empList) {
			if (e.getId() == id) {
				return e;
			}
		}

		return null;
	}
	public static Employee salaryIncrement(Employee e) {
		e.setSalary(e.getSalary()+555);
		return e;
	}
}
