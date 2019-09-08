package learn;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainClass {
	public static void main(String[] args) {
		Person p1 = new Person("Ankit",25);
		List<Person> personList = new ArrayList<>();
		Person p2 = new Person("Apurv",29);
		personList.add(p1);
		personList.add(p2);
		
		Map<Integer,Long> ageGroup = personList.parallelStream()
				.collect(Collectors.groupingBy(p -> p.getAge() , Collectors.counting()));
		
//		Map<Integer,Long> ageGroupSecond = personList.parallelStream().collect(Collectors.groupingBy(t->t.getAge(),t->t.get));
		
//		List<Integer> myIntList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3);
//
//		Map<Integer, Long> frequencyMap = myIntList.parallelStream()
//				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		
		System.out.println(ageGroup);
	}
}

class Person {
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}