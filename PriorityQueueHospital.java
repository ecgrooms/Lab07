import java.util.PriorityQueue;

public class PriorityQueueHospital<PatientType> extends Hospital<PatientType>{
	
	private PriorityQueue<PatientType> priorQue;
	
	public void addPatient(PatientType patient) {
		
		priorQue.add(patient);
		
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
