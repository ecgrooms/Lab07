import org.junit.Assert;

public class StackHospitalTest {
	
	public void Test() {
		
		SickPerson bob = new SickPerson("Bob", 40, 60);
		HealthyPerson lucy = new HealthyPerson("Lucy", 28, "headache");
		StackHospital<Person> stackHospital = new StackHospital<Person>();

		Assert.assertEquals("Stack Hospital was not empty", 0, stackHospital.numPatients());
		Assert.assertEquals("Empty Stack Hospital info incorrect", 0, stackHospital.allPatientInfo());
		Assert.assertNull("Empty Stack Hospital next patient should be null", stackHospital.nextPatient());
		Assert.assertNull("Empty Stack Hospital treat next patient should be null", stackHospital.treatNextPatient());

		stackHospital.addPatient(bob);
		stackHospital.addPatient(lucy);
		
		Assert.assertEquals("Stack Hospital was not empty", 2, stackHospital.numPatients());
		Assert.assertEquals("Empty Stack Hospital info incorrect", 2, stackHospital.allPatientInfo());
		Assert.assertEquals("Empty Stack Hospital next patient should be Bob", stackHospital.nextPatient());
		Assert.assertEquals("Empty Stack Hospital treat next patient should be Bob", stackHospital.treatNextPatient());
		
		
		
	}
	
	public void ComparePerson() {
		
		SickPerson bob = new SickPerson("Bob", 40, 60);
		SickPerson tim = new SickPerson("Tim", 30, 60);
		Assert.assertEquals("Patients have same illness.", 0, bob.compareTo(tim));
		//Assert.assertTrue("The patients have the same illness", bob.compareTo(tim));
		
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