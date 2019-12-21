package main.java.Stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOnEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] empIds = { 1, 2, 3, 4 };

		// findFirst()
		Employee employee = Stream.of(empIds).map(EmployeeRepository::findById).filter(e -> e != null)
				.filter(e -> e.getSalary() > 50000).findFirst().orElse(null);

		System.out.println(employee);

		// List of employees having filter
		System.out.println("------  filter ------------");
		EmployeeRepository.employeeRepository().stream().map(EmployeeRepository::salaryIncrement)
				.filter(e -> e.getSalary() > 50000)
				// .collect(Collectors.toList());
				.forEach(e -> System.out.println(e));

		// toArray[]
		System.out.println("------toArray[] ------------");
		Employee[] employees = EmployeeRepository.employeeRepository().stream().map(EmployeeRepository::salaryIncrement)
				.filter(e -> e.getSalary() > 50000)
				// .collect(Collectors.toList());
				.toArray(Employee[]::new);

		System.out.println(employees);

		System.out.println("---------- FLAT MAP --------------");
		List<List<String>> namesNested = Arrays.asList(Arrays.asList("Jeff", "Bezos"), Arrays.asList("Bill", "Gates"),
				Arrays.asList("Mark", "Zuckerberg"));

		// List<String> namesFlatStream =
		namesNested.stream().flatMap(x -> x.stream())
				// .collect(Collectors.toList());
				.forEach(e -> System.out.println(e));
		System.out.println("---------- FLAT MAP2 --------------");
		// List<String> namesFlatStream1 =
		namesNested.stream().flatMap(Collection::stream)
				// .collect(Collectors.toList());
				.forEach(e -> System.out.println(e));

		System.out.println("---------- INT Stream --mapToInt-- Max()--------------");

		System.out.println(EmployeeRepository.employeeRepository().stream()
				.mapToInt(Employee::getId).max()
				.orElseThrow(NoSuchElementException::new));
		
		System.out.println("----------  Stream<Imteger> --max -- Max()--------------");
		System.out.println(EmployeeRepository.employeeRepository().stream().map(Employee::getId)
				.max((x, y) -> (x - y) > 1 ? -1 : (x - y) < 1 ? 1 : 0)
				.orElseThrow(NoSuchElementException::new));
		
		
		
		Set<String> empNames = EmployeeRepository.employeeRepository().stream()
	            .map(Employee::getName)
	            .collect(Collectors.toCollection(HashSet::new));
		System.out.println();

	}

}
