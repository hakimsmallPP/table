package base_de_donne;

import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.jdbc.*;


public class sqlconn {
	 public static void main(String[] args) {
	 
	 }
	public static Connection dbconn() {
		Connection dbconn=null; 
		try {
			dbconn=(Connection) DriverManager.getConnection("Jdbc:mysql://127.0.0.1:3306/pfe","root","ghost123face");
			if (dbconn!=null) {
				System.out.println("connected successfully");
			}
		}catch (Exception e)
		{ System.out.println("not connected to database");
	}
		return null;

}}
