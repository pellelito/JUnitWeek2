package Week2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class TestClassWeek2 {
	
	
	
	//Uppgift 1 
	//Assert stavas med litet l, det måste vara 2 citationstecken på stängen som skall testas
	
	@Test
	@DisplayName("Test String backwards")
	public void testWritingSomeTextBackwards( ) {
		StringBuilder  testStr = new StringBuilder("Jag");
		assertEquals("gaJ",testStr.reverse().toString());
		
		}
	//Uppgift 2
	//Det failar. Tester skall vara void.
	
	@Test
	public void testJustASimpleAssert( ) {
	String name = "My name";
	assertEquals("My name", name);
	//return "String";
	}
	
	//Uppgift 3
	//Jag skulle samla uppgifterna i ett objekt och sedan testa samtliga attribut tillsammans.
	
	@Test
	public void testTryingDifferentThings() {
		
		Person pers = new Person("first name", "last name", 0701111111, "my cool street");
	
		assertAll(
			      "pers",
			      () -> assertEquals("first name", pers.getFirstname()),
			      () -> assertEquals("last name", pers.getLastname()),
			      () -> assertEquals("wrong phonenumber", 0701111111, pers.getPhonenumber()),
			      () -> assertEquals("my cool street", pers.getStreetaddress())
			    );	
	}
	
	// Uppgift 4
	//If there is no assertion, it isn't a test. Skulle utgångspunkten vara att ifall inget fel genereras så blir det ett "pass?
	
	@Test
	public void testTestingAsSimpleAsPossible() {
		
		
		//System.out.println("Junit 5").lenght();
		assertEquals(7, ("Junit 5").length());
	
	}
	
	// Uppgift 5
	//Den kör och ger pass
	
	@Test
	public void testGiveMeASimpleVerification() {
		assertEquals(100, 100);
	}
	
	// Uppgift 6
	//Felar för att de inte refererar till samma objekt/sträng

	
	@Test
	public void testCheckingSame() {
		
	String s1 = new String("S1");
	//String s2 = new String("S1");
	String s2 = s1;
	
	assertSame(s1, s2); 
	//assertEquals(s1,s2); 
	}
	
	//Uppgift 7
	
	@Test
	public void testCheckingBytes() {
		
	byte smallByte1 = 100;
	byte smallByte2 = smallByte1;
	
	//assertEquals(smallByte1, smallByte2);
	assertTrue(smallByte1 == smallByte2);
	}
	
	//Uppgift 8????
	
	// Uppgift 9
	
	@Test
	public void testCheckingTrue() {
		
	Object obj1 = new Object();
	Object obj2 = obj1;
	
	assertTrue(obj1 == obj2); 
	// assertTrue(obj1.equals(obj2)); 
	//assertEquals(obj1,obj2);
	
	}
	
	//Uppgift 10
	//Saknas några semikolon
	
	@Test
	public void testCheckingFalse() {
	Object obj1 = new Object();
	Object obj2 = new Object();
	assertFalse(obj1 == obj2);
	//assertTrue(obj1 != obj2); //Alternativt
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

 class Person {
	 	String firstname;
		String lastname;
		int phonenumber;
		String streetaddress;
		int age;
		
		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public Person(String strFirst, String strLast, int number, String strStreet) {
			
			this.firstname = strFirst;
			this.lastname = strLast;
			this.phonenumber = number;
			this.streetaddress = strStreet;
			
		}
		
		//just setters & getters
		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public int getPhonenumber() {
			return phonenumber;
		}

		public void setPhonenumber(int phonenumber) {
			this.phonenumber = phonenumber;
		}

		public String getStreetaddress() {
			return streetaddress;
		}

		public void setStreetaddress(String streetaddress) {
			this.streetaddress = streetaddress;
		}

		
	
	
}
