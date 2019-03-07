
public class HealthyPerson extends Person{
	
	public HealthyPerson(String name, int age, String reason) {
		super(name, age);
	}
	
	protected int compareToImpl(Person p) {
		return 0;
	}
	
	public String toString() {
		return null;
		
	}

}
