package PGLP_5.PGLP5_1;

import org.junit.Before;
import org.junit.Test;

public class PersonnelDAOTest {
	Personnels persoSave;
	Personnels persoGet;
	
	@Before
	  public void setup() {
		
		persoSave= new Personnels
				.Builder("KI", "Serge Laobien", 1).build();
		
	}



	@Test
	public void test() {
		
	}

}
