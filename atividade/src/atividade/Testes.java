package atividade;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testes {

	@Test
	void testaStatement() {
		Customer alguem = new Customer("John Smith");
		
		Movie lotr1 = new Movie("Lord of the Rings Fellowship of the Ring", 1);
		Movie lotr2 = new Movie("Lord of the Rings Two Towers", 0);
		Movie lotr3 = new Movie("Lord of the Rings Return of the King", 2);
		
		assertEquals(alguem.statement(),"Rental Record for John Smith\n" + 
				"Amount owed is 0.0\n" + 
				"You earned 0 frequent renter points");
		
		Rental r1 = new Rental(lotr1, 1);
		alguem.addRental(r1);
		
		assertEquals(alguem.statement(),"Rental Record for John Smith\n" + 
				"	Lord of the Rings Fellowship of the Ring	3.0\n" + 
				"Amount owed is 3.0\n" + 
				"You earned 1 frequent renter points");		
		
		Rental r2 = new Rental(lotr2, 2);
		alguem.addRental(r2);
		Rental r3 = new Rental(lotr3, 3);
		alguem.addRental(r3);
		
		assertEquals(alguem.statement(),"Rental Record for John Smith\n" + 
				"	Lord of the Rings Fellowship of the Ring	3.0\n" + 
				"	Lord of the Rings Two Towers	2.0\n" + 
				"	Lord of the Rings Return of the King	1.5\n" + 
				"Amount owed is 6.5\n" + 
				"You earned 3 frequent renter points");	
	}

}
