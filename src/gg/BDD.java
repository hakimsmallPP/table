package gg;

import java.net.Socket;
import java.sql.*;

public class BDD {
	Connection connection;
	Statement statement;
	String SQL;
	String URL;
	String Username;
	String Password;
	Socket Client;
	int PORT;
	String HOST;
	
	
	public BDD(String URL , String Username, String Password, String HOST, int PORT ) {
		this.URL=URL;
		this.Username=Username;
		this.Password=Password;
		this.HOST=HOST;
		this.PORT=PORT;
		
	}
	// connection au BDD
		public Connection connexionDatabase () {
			try {
				Class.forName("com.sql.jdbc.driver");
				connection =DriverManager.getConnection(URL, Username,Password);
			} catch (Exception e)
			{ System.err.println(e.getMessage());
			}
			return connection;
			
				
				
			}
			
 // fermer la BDD
public Connection closeconnexion () {
	try {
		connection.close();
	} catch (Exception e) 
	{System.err.println(e);
	
	}
	return connection;
}
	
//execution de requete
public ResultSet executionQuery(String sql) {
	connexionDatabase();
	ResultSet resultset = null;
	try {
		statement= connection.createStatement();
		resultset=statement.executeQuery(sql);
		System.out.println(sql);
	}
	catch (SQLException ex)
	{System.err.println(ex);
	}
	return resultset;
}
//execution de requete update
public String executionupdate(String sql) {
	connexionDatabase();
	String result="";
	try {
		statement=connection.createStatement();
		statement.executeUpdate(sql);
		result=sql;
	}
	catch (SQLException ex) {
		result= ex.toString();
	}
		return result;
	}
public ResultSet querySelectALL(String nomTable) {
	connexionDatabase();
	SQL= "SELECT * FROM " + nomTable;
	System.out.println(SQL);
	return this.executionQuery(SQL);
}
	public ResultSet querySelectALL (String nomTable, String état) {
		connexionDatabase();
		SQL="SELECT * FROM " + nomTable + "WHERE" + état;
		return this.executionQuery(SQL);
	}
	public ResultSet querySelect(String[] nomColonne, String nomTable) {
		connexionDatabase();
		int i;
		SQL="SELECT";
		for (i=0;i<=nomColonne.length -1; i++) {
			SQL +=nomColonne[i];
			if (i <nomColonne.length -1) {
				SQL +=",";
			}
		}
		SQL +="FROM" + nomTable;
		return this.executionQuery(SQL);
	}
	public ResultSet fcSelectcommand (String [] nomColonne, String nomTable, String état) {
		connexionDatabase ();
		int i;
		SQL ="SELECT";
		for (i=0; i<=nomColonne.length -1; i++) {
			SQL +=nomColonne[i];
			if (i<nomColonne.length -1) {
				SQL +=",";
			}
		}
		SQL += "FROM" +nomTable + "WHERE" + état;
		return this.executionQuery(SQL);
	}
	//fnct dinsertion des donnee
	public String queryInsert (String nomTable, String[] contenuTableau) {
		connexionDatabase();
		int i;
		SQL ="INSERT INTO " +nomTable + "VALUES(";
		for (i=0; i<=contenuTableau.length -1; i++) {
			SQL +="'" +contenuTableau[i] +"'";
			if(i< contenuTableau.length -1) {
				SQL +=",";
			}
		}
		SQL += ")";
		return this.executionupdate(SQL);
	}
	public ResultSet queryupdate (String [] nomColonne, String nomTable, String état,String [] contenuTableau) {
	connexionDatabase();
	int i;
	SQL="UPDATE" + nomTable + "SET";
	for (i=0; i<=nomColonne.length -1;i++) {
		SQL +=nomColonne[i] + "='" +contenuTableau[i] + "'";
		if (i< nomColonne.length -1) {
			SQL += ",";
		}
	}
	SQL += "WHERE" + état;
	return this.executionQuery(SQL);
}
	//fonction pour la requete supprimer sans parametre
	public String queryDelete (String nomTable) {
		connexionDatabase ();
		SQL ="DELETE FROM" +nomTable;
		return this.executionupdate(SQL);
	}
	// supprimer avec parametre
	public String queryDelete (String nomTable, String état) {
		connexionDatabase ();
		SQL ="DELETE FROM" +nomTable + "WHERE" + état;
		return this.executionupdate(SQL);
}
}







	
	
	


