import java.util.PriorityQueue;

public class PriorityQueueHospital<PatientType> extends Hospital<PatientType>{
	
	private PriorityQueue<PatientType> priorQue;
	
	public void addPatient(PatientType patient) {
		
		priorQue.add(patient);
		
	}
	
	public PatientType nextPatient() {
		return priorQue.peek();
	}
	
	public PatientType treatNextPatient() {
		return priorQue.poll();
	}
	
	public int numPatients() {
		
		int remained = priorQue.size();
		
		return remained;
		
	}
	
	public String hospitalType() {
		return "PriorityQueueHospital";
	}
	
	public String allPatientInfo() {
		
		String patientInfo = priorQue.toString();
		
		return patientInfo;
		
	}

}
