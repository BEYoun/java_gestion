package fr.younes.persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.younes.metier.User;

public class UserDAO extends DAO<User>{

	public UserDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(User obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(User obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(User obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User find(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<User> getUser(){
		List<User> maList=new ArrayList<User>();
		User a;
		String sql="SELECT * FROM users";
		try {
			PreparedStatement statement=this.connect.prepareStatement(sql);
			ResultSet rs=statement.executeQuery();
			while(rs.next()) {
				a=new User(rs.getInt("id"),rs.getString("email"),rs.getString("password"),rs.getString("username"));
				maList.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return maList;
	}

}
