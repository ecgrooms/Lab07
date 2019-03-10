import java.util.Stack;


public class StackHospital<PatientType> extends Hospital<PatientType>{
	
	private Stack<PatientType> patientStack = new Stack<PatientType>();
	
	public StackHospital() {
		
	}
	
	public void addPatient(PatientType patient) {
		
		patientStack.add(patient);
		
	}
	
	public PatientType nextPatient() {
		
		return patientStack.peek();
		
	}
	
	public PatientType treatNextPatient() {
		
		
		return patientStack.pop();
	}
	
	public int numPatients() {
		int remainedPatients = 0;
		
		for(int i = 0; i < patientStack.size(); i++) {
			remainedPatients++;
		}
		
		return remainedPatients;
	}
	
	public String hospitalType() {
		return "StackHopsital";
	}
	
	public String allPatientInfo() {
		return allPatientInfo();
	}
	
}
