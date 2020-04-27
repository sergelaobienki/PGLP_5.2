package PGLP_5.PGLP5_1;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class FactoryDAOTest {
	
	Personnels PersonnelsSave;
	Personnels PersonnelsGet;
	PersonnelsDAO PersonnelsDao;

	@Before
	public void setUp() throws Exception {
		PersonnelsGet=null;
		PersonnelsDao=null;
		PersonnelsSave= new Personnels
				.Builder("KI", "Serge Laobien", 2).build();
	}

	@Test
	public void test() {
		//DAOFactory daoFactory = new DAOFactory();
		PersonnelsDao = FactoryDAO.getPersonnelsDao();
		PersonnelsGet=PersonnelsDao.create(PersonnelsSave);
		assertTrue(PersonnelsGet!=null);
	}

}
