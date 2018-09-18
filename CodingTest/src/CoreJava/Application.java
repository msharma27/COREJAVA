package CoreJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Application {

	public static void main(String[] args) {
		// list of employees

		List<Employee> list = Arrays.asList(new Employee[] {
				new Employee("Linda", 11, new Address(101, "44 Holland Avenue", "Albany", "NY", 12222)),
				new Employee("John", 88, new Address(201, "44 Holland Avenue", "Albany", "NY", 12222)),
				new Employee("Max", 44, new Address(301, "22 Manning Blvd", "Cupertino", "CA", 14301)),
				new Employee("Larry", 99, new Address(401, "369 Manning Blvd", "Greenbelt", "MD", 12206)),
				new Employee("Mark", 33, new Address(501, "27 Marshall Road", "Lowell", "MA", 40195)),

		});

		// sort list by Employee ID - Comparable
		System.out.println("\n---------------- Part 1--------------\n");

		Collections.sort(list);
		list.forEach(System.out::println);

		// sort list by Address zip code - if same zip code then consider Employee name
		// - lambda Expression

		System.out.println("\n---------------- Part 2--------------\n");

		Collections.sort(list,
				(o1, o2) -> (o1.getAddress().getZip().compareTo(o2.getAddress().getZip()) == 0)
						? (o1.getName().compareTo(o2.getName()))
						: o1.getAddress().getZip().compareTo(o2.getAddress().getZip()));

		list.forEach(System.out::println);

		// Converting the list to a set based on a filter (employee ID > 30)
		System.out.println("\n ---------------- Part 3--------------\n");

		Set<Employee> employee = list.stream().filter(x -> x.getId() > 30).collect(Collectors.toSet());

		System.out.println();
		employee.forEach(System.out::println);

	}
}
