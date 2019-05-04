package fr.younes.metier;

import java.util.List;

import fr.younes.connection.SdzConnection;
import fr.younes.persistance.UserDAO;

public class UserManagement {
	private User monArticle;
	private UserDAO udao = new UserDAO(SdzConnection.getInstance());
	
	public UserManagement() {
		
	}
	
	
	public List<User> getAll(){
		return udao.getUser();
		
	}
	
	public void update(int id,int Qt) {
		
	}
}
