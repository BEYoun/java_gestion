package fr.younes.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SdzConnection{

  /**
  * URL de connection
  */
  private static String url = "jdbc:postgresql://localhost:5432/gestion";

  /**
  * Nom du user
  */
  private static String user = "postgres";

  /**
  * Mot de passe du user
  */
  private static String passwd = "nino";

  /**
  * Objet Connection
  */
  private static Connection connect;

  /**
  * M�thode qui va retourner notre instance
  * et la cr�er si elle n'existe pas...
  * @return
  */
  //Constructeur priv�
  private SdzConnection(){
    try {
      connect = DriverManager.getConnection(url, user, passwd);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
   
  //M�thode qui va nous retourner notre instance et la cr�er si elle n'existe pas
  public static Connection getInstance(){
	  if(connect == null){
	    new SdzConnection();
	    System.out.println("INSTANCIATION DE LA CONNEXION SQL ! ");
	  }
	  else{
	    System.out.println("CONNEXION SQL EXISTANTE ! ");
	  }
	  return connect;   
	}
}