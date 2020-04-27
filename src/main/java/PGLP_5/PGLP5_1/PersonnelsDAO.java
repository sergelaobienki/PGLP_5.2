package PGLP_5.PGLP5_1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


// La classe PersonnelsDAO permet d'enregistrer le personnel de l'entreprise


public class PersonnelsDAO extends DAO<Personnels>{



	private Connection connect;

	public PersonnelsDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Personnels create(Personnels obj) {
		try {
			
			Statement s;
			s = connect.createStatement();
			try {
		        s.execute("create table derby(Nom varchar(40), Prenom varchar(40),Id int)");
		        System.out.println("Created table location");
			} catch (Exception e) {
				// TODO: handle exception
			}
			PreparedStatement prepare = connect.prepareStatement("INSERT INTO derby (nom, prenom, Id) VALUES (?,?,?) ");
			prepare.setString(1, obj.getNom());
			prepare.setString(2, obj.getPrenom());
			prepare.setInt(3, obj.getId());
			prepare.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return obj;
	}

	public Personnels find(int Id) {

		Personnels perso=null;
		try {
			PreparedStatement prepare = this.connect.prepareStatement("SELECT * FROM derby WHERE ID = ?");
			prepare.setInt(1, Id);
			ResultSet result= prepare.executeQuery();
			if(result.first()) {
				perso = new Personnels
						.Builder(result.getString("Nom"), result.getString("Prenom"), result.getInt("Id"))
						.build();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return perso;
	}

	@Override
	public Personnels update(Personnels obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Personnels obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Personnels find(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}