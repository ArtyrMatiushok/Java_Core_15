package les15.packZooclub;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Person))
			return false;
		Person p = (Person)obj;
		return (this.age == p.age) && this.name.equals(p.name);
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 37 * result + name.hashCode();
		result = 37 * result + age;
		return result;
	}
	
	
}
