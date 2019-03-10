import java.util.Queue;

public class QueueHospital<PatientType> extends Hospital<PatientType> {
	
	private Queue<PatientType> quePatient;
	
	public void addPatient(PatientType patient) {
		
		quePatient.add(patient);
		
	}
	
	public PatientType nextPatient() {
		return nextPatient();
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



