package fr.younes.persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.younes.metier.Employee;

public class EmployeesDAO extends DAO<Employee>{
	

	public EmployeesDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	public List<Employee> listEmploye() {
		List<Employee> maList=new ArrayList<Employee>();
		Employee a;
		String sql="SELECT * FROM employes";
		try {
			PreparedStatement statement=this.connect.prepareStatement(sql);
			ResultSet rs=statement.executeQuery();
			while(rs.next()) {
				a=new Employee(rs.getInt("id"),
						rs.getString("username"),
						rs.getString("nom"),
						rs.getString("prenom"),
						rs.getString("password"),
						rs.getString("role"));
				maList.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return maList;
	}
	
	public ArrayList<Employee> archiveEmploye() {
		ArrayList<Employee> list = new ArrayList<Employee>();
		Employee user;
		String sql="select * from  employes where archiver =true";
		try {
			PreparedStatement statement=this.connect.prepareStatement(sql);
			ResultSet rs=statement.executeQuery();
			while (rs.next()) {
				user = new Employee();
				user.setId(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setPassword(rs.getString(3));
				user.setRole(rs.getString(4));
				
				
				list.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	

	
	public boolean editUser(Employee user) {
		String sql="update employes set Username=?, password=?,role=?  where id=?";
		try {
			PreparedStatement statement=this.connect.prepareStatement(sql);
			statement.setString(1, user.getUsername());
			statement.setString(2, user.getPassword());

			statement.setString(3, user.getRole());
			
			statement.setInt  (4, user.getId());

			return statement.executeUpdate() > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean ArchiveUser(Employee user) {
		String sql="update employes set archiver=?  where id=?";
		try {
			PreparedStatement statement=this.connect.prepareStatement(sql);
			statement.setBoolean(1,true); 
			statement.setInt  (2, user.getId());

			return statement.executeUpdate() > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}


	@Override
	public boolean create(Employee obj) {
		String sql="insert into employes(nom,prenom,username,password,role)"
				+ " values ('"+obj.getNom()+"','"+obj.getPrenom()+"','"+obj.getUsername()+"','"+obj.getPassword()+"','"+obj.getRole()+"');";
		try {
			System.out.println(sql);
			PreparedStatement statement=this.connect.prepareStatement(sql);
			statement.execute();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(Employee obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Employee obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee find(int id) {
		Employee user = new Employee();
		String sql="select * from employes where id=?;";
		try {
			
			PreparedStatement statement=this.connect.prepareStatement(sql);
			statement.setInt(1, id);
			ResultSet rs=statement.executeQuery();
			if (rs.next()) {
				user = new Employee();
				user.setId(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setPassword(rs.getString(3));
				user.setRole(rs.getString(4));
				
				
		     
				
		
			} } catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	public List<Employee> listEmployeOnly() {
		List<Employee> maList=new ArrayList<Employee>();
		Employee a;
		String sql="SELECT * FROM employes where role='employee'";
		try {
			PreparedStatement statement=this.connect.prepareStatement(sql);
			ResultSet rs=statement.executeQuery();
			while(rs.next()) {
				a=new Employee(rs.getInt("id"),
						rs.getString("username"),
						rs.getString("nom"),
						rs.getString("prenom"),
						rs.getString("password"),
						rs.getString("role"));
				maList.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return maList;
	}
	public List<Employee> listChefOnly() {
		List<Employee> maList=new ArrayList<Employee>();
		Employee a;
		String sql="SELECT * FROM employes where role='chef'";
		try {
			PreparedStatement statement=this.connect.prepareStatement(sql);
			ResultSet rs=statement.executeQuery();
			while(rs.next()) {
				a=new Employee(rs.getInt("id"),
						rs.getString("username"),
						rs.getString("nom"),
						rs.getString("prenom"),
						rs.getString("password"),
						rs.getString("role"));
				maList.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return maList;
	}


	
}
