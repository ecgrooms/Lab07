import java.util.Stack;


public class StackHospital<PatientType> extends Hospital<PatientType>{
	
	private Stack<PatientType> patientStack;
	
	public void addPatient(PatientType patient) {
		
		patientStack.add(patient);
		
	}
	
	public PatientType nextPatient() {
		return null;
	}
	
	public PatientType treatNextPatient() {
		return null;
	}
	
	public int numPatients() {
		return 0;
	}
	
	public String hospitalType() {
		return null;
	}
	
	public String allPatientInfo() {
		return null;
	}
	
}
