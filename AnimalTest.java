import org.junit.Assert;

public class AnimalTest {
	
	public void test() {
		
		Animal cat = new Animal("cat", 3);
		Assert.assertEquals("Animal's breed was incorrect", "cat", cat.getBreed());
		Assert.assertEquals("Animal's age was incorrect", 3, cat.getAge());
		
	}
	
	public String toString() {
		
		Animal cat = new Animal("cat", 4);
		
		Assert.assertEquals("A four years old cat.", "cat", cat.toString());
		
	}

}
