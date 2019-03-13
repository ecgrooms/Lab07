import org.junit.Assert;

public class PriorityQueueTest {
	
	public void Test() {
		
		SickPerson bob = new SickPerson("Bob", 40, 60);
		HealthyPerson lucy = new HealthyPerson("Lucy", 28, "headache");
		PriorityQueueHospital<Person> priorityQueueHospital = new PriorityQueueHospital<Person>();

		Assert.assertEquals("Priority Queue Hospital was not empty", 0, priorityQueueHospital.numPatients());
		Assert.assertEquals("Empty Priority Queue Hospital info incorrect", 0, priorityQueueHospital.allPatientInfo());
		Assert.assertNull("Empty Priority Queue Hospital next patient should be null", priorityQueueHospital.nextPatient());
		Assert.assertNull("Empty Priority Queue Hospital treat next patient should be null", priorityQueueHospital.treatNextPatient());

		priorityQueueHospital.addPatient(bob);
		priorityQueueHospital.addPatient(lucy);
		
		Assert.assertEquals("Priority Queue Hospital was not empty", 2, priorityQueueHospital.numPatients());
		Assert.assertEquals("Empty Priority Queue Hospital info incorrect", 2, priorityQueueHospital.allPatientInfo());
		Assert.assertEquals("Empty Priority Queue Hospital next patient should be Bob", priorityQueueHospital.nextPatient());
		Assert.assertEquals("Empty Priority Queue Hospital treat next patient should be Bob", priorityQueueHospital.treatNextPatient());
		
		
		
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
