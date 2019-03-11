
public class SickPerson extends Person {
	
	private int serverity;
	
	public SickPerson(String name, int age, int serverity) {
		super(name, age);
		
		this.serverity = serverity;
		
	}
	
	protected int compareToImpl(Person p) {
		
		if(p instanceof SickPerson) {
			
			SickPerson otherSickPerson = (SickPerson) p;
			
			if(otherSickPerson.serverity > this.serverity) {
				return 1;
			}
			else if(otherSickPerson.serverity < this.serverity){
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
		return String.format("%s Severity level %d", super.toString(), serverity);
	}

}
