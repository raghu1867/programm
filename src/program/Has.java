package program;

import java.util.HashMap;
import java.util.Map.Entry;

public class Has {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "jaya");
		hm.put(2, "satyapal");
		hm.put(null, "abc");
		hm.put(5, null);
		hm.put(6, null);
		hm.put(3, "jaya");
		hm.put(4, "jaya");

		System.out.println("print all: " + hm);
		System.out.println("print the hashmap : " + hm.get(null));

		for (Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + "" + m.getValue());

		}

		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		Employee e1 = new Employee("Tom", 23, "cse");
		Employee e2 = new Employee("jaya", 20, "mtech");
		Employee e3 = new Employee("reddy", 22, "cse");
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);

		for (Entry<Integer, Employee> y : emp.entrySet()) {
			int key = y.getKey();
			Employee e = y.getValue();
			System.out.println(key + "info");
			System.out.println(e.name + "   " + e.age + "  " + e.dept);

		}

	}

}
