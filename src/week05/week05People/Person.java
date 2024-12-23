package week05.week05People;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	
	//constructor
	public Person(String firstName, String lastName, int age) {
		this.setFirstName(firstName); // or this.name=name;
		this.setLastName(lastName); // or this.name=suit;
		this.setAge(age); // or this.name=value;
	
}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	} 
	public void describe() {
		System.out.println(firstName +" "+ lastName + " " + age);
	}
}
