package fr.younes.metier;

import java.util.ArrayList;
import java.util.List;

import fr.younes.connection.SdzConnection;
import fr.younes.persistance.EmployeesDAO;

public class EmployeeManagement {
	private Employee monEmployee;
	private EmployeesDAO edao = new EmployeesDAO(SdzConnection.getInstance());
	public EmployeeManagement() {
	}
	
	public List<Employee> listEmploye() {
		return edao.listEmploye();
	}
	
	public Employee getUser(int id) {
		return edao.find(id);
	}
	
	public void addUser(Employee user) {
		edao.create(user);
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

	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return edao.listEmploye();
	}

	public List<Employee> getEmployeesOnly() {
		// TODO Auto-generated method stub
		return edao.listEmployeOnly();
	}

	public List<Employee> getChefOnly() {
		// TODO Auto-generated method stub
		return edao.listChefOnly();
	}

	public boolean addEmp(Employee e) {
		// TODO Auto-generated method stub
		return edao.create(e);
		
	}
}
