import java.util.Stack;


public class StackHospital<PatientType> extends Hospital<PatientType>{
	
	private Stack<PatientType> patientStack;
	
	public StackHospital() {
		
	}
	
	public void addPatient(PatientType patient) {
		
		patientStack.add(patient);
		
	}
	
	public PatientType nextPatient() {
		
		for(int i = 0; i < patientStack.size(); i++) {
			
		}
		return nextPatient();
	}
	
	public PatientType treatNextPatient() {
		
		
		return treatNextPatient();
	}
	
	public int numPatients() {
		int remainedPatients = 0;
		
		for(int i = 0; i < patientStack.size(); i++) {
			remainedPatients++;
		}
		
		return remainedPatients;
	}
	
	public String hospitalType() {
		return hospitalType();
	}
	
	public String allPatientInfo() {
		return allPatientInfo();
	}
	
}
