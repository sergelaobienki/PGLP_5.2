package PGLP_5.PGLP5_1;

import java.sql.Connection;

public class FactoryDAO{
	
	public static DAO<Personnels> PersonnelsDAO(Connection conn){
		return new PersonnelsDAO(conn);
	}
	
	public static DAO<CompositePersonnels> getCompositePersonnels(Connection conn){
		return new CompositePersonnelsDAO(conn);
	}

	public static PGLP_5.PGLP5_1.PersonnelsDAO getPersonnelsDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	public static PGLP_5.PGLP5_1.PersonnelsDAO getPersonnelsDao() {
		// TODO Auto-generated method stub
		return null;
	}


}