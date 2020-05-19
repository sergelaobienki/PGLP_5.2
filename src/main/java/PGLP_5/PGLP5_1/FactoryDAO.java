package PGLP_5.PGLP5_1;

import java.sql.Connection;

public class FactoryDAO{
	
private static final Connection conn=EntrepriseConn.EntrepriseConn();
	
	
	public static PersonnelsDAO getPersonnelsDAO(){
		return new PersonnelsDAO(conn);
	}
	
	public static CompositePersonnelsDAO getCompositePerso(){
		return new CompositePersonnelsDAO(conn);
	}


}