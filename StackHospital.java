import java.util.Stack;


public class StackHospital<PatientType> extends Hospital<PatientType>{
	
	private Stack<PatientType> patientStack;
	
	public void addPatient(PatientType patient) {
		
		patientStack.add(patient);
		
	}
	
	public PatientType nextPatient() {
		return nextPatient();
	}
	
	public PatientType treatNextPatient() {
		return treatNextPatient();
	}
	
	public int numPatients() {
		return numPatients();
	}
	
	public String hospitalType() {
		return hospitalType();
	}
	
	public String allPatientInfo() {
		return allPatientInfo();
	}
	
}
