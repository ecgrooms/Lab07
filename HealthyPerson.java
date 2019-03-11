
public class HealthyPerson extends Person{
	
	private String reason;
	
	public HealthyPerson(String name, int age, String reason) {
		super(name, age);
		
		this.reason = reason;
	}
	
	protected int compareToImpl(Person p) {
		
		if(p instanceof HealthyPerson) {
			
			HealthyPerson otherHealthyPerson = (HealthyPerson) p;
			
			if( otherHealthyPerson.reason.compareTo(this.reason) < 0 ) {
				return 1;
			}
			else if( otherHealthyPerson.reason.compareTo(this.reason) > 0 ){
				return -1;
			}
			else {
				return 0;
			}
		}
		else {
			return 0;
		}
		
	}
	
	public String toString() {
		return String.format("%s In for %s", super.toString(), reason);
		
	}

}
