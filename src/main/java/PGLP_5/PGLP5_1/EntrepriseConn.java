package PGLP_5.PGLP5_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EntrepriseConn {
	
	/**
	 * Création de la base de données.
	 * 
	 * @return Le connecteur a la base
	 * @throws SQLException
	 */

	private static String JDBC_URL= "jdbc:derby:PersonnelDB;create=true";
	private static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";

	public static Connection EntrepriseConn() {

		Connection conn = null;
		try {

			Class.forName(DRIVER);
			conn = DriverManager.getConnection(JDBC_URL);
			System.out.println("connection reuissi");

		} catch (SQLException e) {
			System.out.println("echec de connexion");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("ERREUR : charger derby.jdbc.EmbeddedDriver ");
		}
		return conn;

	}

	}
