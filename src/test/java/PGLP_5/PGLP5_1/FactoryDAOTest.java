package PGLP_5.PGLP5_1;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class FactoryDAOTest {
	
	Personnels persoSave;
	Personnels persoSave1;
	Personnels persoSave2;
	Personnels persoSave3;
	Personnels persodelete;
	Personnels persoGet;
	Personnels persoGet1;
	Personnels persoGet2;
	Personnels persoGet3;
	Personnels persofind;
	Personnels persofind1;
	PersonnelsDAO persoDao;

	@Before
	public void setUp() throws Exception {
		persoGet=null;
		persoDao=null;
		persofind=null;
		persoSave= new Personnels
				.Builder("KI", "Serge Laobien", 1).build();
		persoSave1= new Personnels
				.Builder("Savadogo", "Abel", 2).build();
		persoSave2= new Personnels
				.Builder("Gautier", "Yves", 3).build();
		persoSave3= new Personnels
				.Builder("Distribois", "Herve", 4).build();
		persodelete= new Personnels
				.Builder("Konde", "Kader", 5).build();
	}

	@Test
	public void testCreate() {
		persoDao = FactoryDAO.getPersonnelsDAO();
		persoGet1=persoDao.create(persoSave1);
		persoGet=persoDao.create(persoSave);
		persoGet2=persoDao.create(persoSave2);
		persoGet3=persoDao.create(persoSave3);
		persoGet3=persoDao.create(persodelete);
		assertTrue(persoGet!=null);
		assertTrue(persoGet1!=null);
		assertTrue(persoGet2!=null);
		assertTrue(persoGet3!=null);
		
		
	}
	
	@Test
	public void testfind() {
		persoDao = FactoryDAO.getPersonnelsDAO();
		persofind=persoDao.find(1);
		persofind1=persoDao.find(3);
		assertTrue(persofind!=null);
		assertTrue(persofind1!=null);
		persofind.print();
		persofind1.print();
		
		
	}
	
	
}
