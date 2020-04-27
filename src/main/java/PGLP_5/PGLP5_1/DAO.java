package PGLP_5.PGLP5_1;

import java.io.Serializable;
import java.sql.Connection;

@SuppressWarnings("serial")
public abstract class DAO<T> implements Serializable{
	
	public DAO(Connection conn) {
		// TODO Auto-generated constructor stub
	}
	public abstract T create(T obj);
	public abstract T find(String id);
	public abstract T update( T obj);
	public abstract void delete (T obj);

}