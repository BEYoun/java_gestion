package fr.younes.persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.younes.metier.Employee;
import fr.younes.metier.Processus;

public class ProcessusDAO extends DAO<Processus>{

	

	public ProcessusDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Processus obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Processus obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Processus obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Processus find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Processus> listProcessus() {
		List<Processus> maList=new ArrayList<Processus>();
		Processus a;
		String sql="SELECT * FROM processus";
		EmployeesDAO daoEmp=new EmployeesDAO(connect);
		try {
			PreparedStatement statement=this.connect.prepareStatement(sql);
			ResultSet rs=statement.executeQuery();
			while(rs.next()) {
				a=new Processus(rs.getInt("id"),
						rs.getString("nom"),
						daoEmp.find(rs.getInt("employes_id")));
				maList.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return maList;
	}

}
