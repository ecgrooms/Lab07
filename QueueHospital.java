import java.util.Queue;

public class QueueHospital<PatientType> extends Hospital<PatientType> {
	
	private Queue<PatientType> quePatient;
	
	public void addPatient(PatientType patient) {
		
		quePatient.add(patient);
		
	}
	
	public PatientType nextPatient() {
		return quePatient.peek();
	}
	
	public PatientType treatNextPatient() {
		return quePatient.remove();
	}
	
	public int numPatients() {
		
		int patients = quePatient.size();
		
		return patients;
	}
	
	public String hospitalType() {
		return "QueueHospital";
	}
	
	public String allPatientInfo() {
		
		String allInfo = quePatient.toString();
		
		return allInfo;
	}
	
}



