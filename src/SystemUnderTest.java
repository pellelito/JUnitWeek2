import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


@DisplayName("A special test case")
public class SystemUnderTest {
	
	Cars testCar = new Cars();
	String msg = "Error in test";
	
	@Test
	@DisplayName("My Test")
	public void testMake() {
		testCar.setMake("Tesla");
		assertEquals(msg,"Tesla", testCar.getMake());
	}
	@Test
	@DisplayName("╯°□°）╯")
	public void testYear() {
		testCar.setYear(2015);
		assertEquals(msg, 2015, testCar.getYear());
	}
	@Test
	public void testColor() {
		testCar.setColor("black");
		assertEquals("black", testCar.getColor());
	}
	@Test
	@DisplayName("😱")
	public void testTopSpeed() {
		testCar.setTopSpeed(225);
		assertEquals(225, testCar.getTopSpeed());
	}
	@Test
	public void testRoadTax() {
		testCar.setRoadTax(360);
		assertEquals(360, testCar.getRoadTax());
	}
	@Test
	public void testCar() {
		
		assertNotNull(testCar);
	}
	@Test
	public void Writing_Sometext_Backwards( ) {
		StringBuilder b = new StringBuilder("Jag");
		assertEquals("gaJ", b.reverse().toString());
		}
	
}
