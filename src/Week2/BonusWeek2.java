package Week2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class BonusWeek2 {
	
		//Bonusuppgift
		private Person pers;
	
		@BeforeEach
	    public void createObjects() throws Exception {
			pers = new Person("Pelle", "Löfstrand", 118118, "Hemmavid");
			pers.setAge(45);
	    }
		
		@Test
		@DisplayName("Test My Bouns Task")
		public void testBonusuppgift() {
			
			
			assertNotNull("Object returns null", pers);
			
			assertAll(
				      "pers",
				      () -> assertEquals("Pelle", pers.getFirstname()),
				      () -> assertEquals("Löfstrand", pers.getLastname()),
				      () -> assertEquals(45, pers.getAge())
				    );	
			
		}

}
