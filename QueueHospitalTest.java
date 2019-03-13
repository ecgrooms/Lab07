import org.junit.Assert;

public class QueueHospitalTest {
	
	public void Test() {
		
		SickPerson bob = new SickPerson("Bob", 40, 60);
		HealthyPerson lucy = new HealthyPerson("Lucy", 28, "headache");
		QueueHospital<Person> queueHospital = new QueueHospital<Person>();

		Assert.assertEquals("Queue Hospital was not empty", 0, queueHospital.numPatients());
		Assert.assertEquals("Empty Queue Hospital info incorrect", 0, queueHospital.allPatientInfo());
		Assert.assertNull("Empty Queue Hospital next patient should be null", queueHospital.nextPatient());
		Assert.assertNull("Empty Queue Hospital treat next patient should be null", queueHospital.treatNextPatient());

		queueHospital.addPatient(bob);
		queueHospital.addPatient(lucy);
		
		Assert.assertEquals("Queue Hospital was not empty", 2, queueHospital.numPatients());
		Assert.assertEquals("Empty Queue Hospital info incorrect", 2, queueHospital.allPatientInfo());
		Assert.assertEquals("Empty Queue Hospital next patient should be Bob", queueHospital.nextPatient());
		Assert.assertEquals("Empty Queue Hospital treat next patient should be Bob", queueHospital.treatNextPatient());
		
		
		
	}
	
	public void ComparePerson() {
		
		SickPerson bob = new SickPerson("Bob", 40, 60);
		SickPerson tim = new SickPerson("Tim", 30, 60);
		Assert.assertEquals("Patients have same illness.", 0, bob.compareTo(tim));
		
		SickPerson ron = new SickPerson("Ron", 35, 55);
		SickPerson gail = new SickPerson("Gail", 43, 70);
		Assert.assertEquals("Patients do not have same illness.", -1, ron.compareTo(gail));
		Assert.assertEquals("Patients do not have same illness.", 1, ron.compareTo(gail));
		
		HealthyPerson lucy = new HealthyPerson("Lucy", 28, "headache");
		HealthyPerson holly = new HealthyPerson("Holly", 32, "headache");
		Assert.assertEquals("Patients have same symptom", 0, lucy.compareTo(holly));
		
		HealthyPerson jo = new HealthyPerson("Jo", 39, "headache");
		HealthyPerson an = new HealthyPerson("An", 29, "cold");
		Assert.assertEquals("Patients do not have same symptom", -1, jo.compareTo(an));
		Assert.assertEquals("Patients do not have same symptom", 1, jo.compareTo(an));
		
	}

}
