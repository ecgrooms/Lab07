
public class SickPerson extends Person {
	
	public SickPerson(String name, int age, int serverity) {
		super(name, age);
	}
	
	protected int compareToImpl(Person p) {
		return 0;
	}
	
	public String toString() {
		return null;
	}

}
