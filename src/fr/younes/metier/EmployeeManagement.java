package fr.younes.metier;

import java.util.ArrayList;
import java.util.List;

import fr.younes.connection.SdzConnection;
import fr.younes.persistance.EmployeesDAO;
import fr.younes.persistance.UserDAO;

public class EmployeeManagement {
	private Employee monArticle;
	private EmployeesDAO edao = new EmployeesDAO(SdzConnection.getInstance());
	public EmployeeManagement() {
	}
	
	public List<Employee> listEmploye() {
		return edao.listEmploye();
	}
	
	public Employee getUser(int id) {
		return edao.find(id);
	}
	
	public boolean addUser(Employee user) {
		return edao.create(user);
	}
	
	public boolean editUser(Employee user) {
		return edao.editUser(user);
	}
	
	public boolean ArchiveUser(Employee user) {
		return edao.ArchiveUser(user);
	}
	public ArrayList<Employee> archiveEmploye() 
	{	return edao.archiveEmploye();
		
	}
}
