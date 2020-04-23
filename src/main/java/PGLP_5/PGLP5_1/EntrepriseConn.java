package PGLP_5.PGLP5_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EntrepriseConn {
	private static String JDBC_URL="jdbc:derby:PersonnelDB;create=true";
	private static final String DRIVER="org.apache.derby.jdbc.EmbeddedDriver";
	
	public static Connection getInstanceConnexion()
	{
		try {
			
				Class.forName(DRIVER);
			
				Connection connec =DriverManager.getConnection(JDBC_URL);
				if (connec!=null)
				{
					System.out.println("Connexion au serveur BD Reussi avec succes");
					return connec;
				}
		} catch (SQLException e )
		{
			System.out.println("Echec de la Connexion");
		}
		catch (ClassNotFoundException e) 
		{
	        System.out.println(e.getMessage());
	        System.out.println("ERREUR : Charger Derby.jdbc.EmbeddedDriver ");
	       
	    }
		return null;
	
	

}
