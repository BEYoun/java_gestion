package fr.younes.presentation.controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTextField;

import fr.younes.metier.Employee;
import fr.younes.metier.Processus;
import fr.younes.metier.User;
import fr.younes.presentation.model.AbstractModel;
import fr.younes.presentation.view.Dashbord;

public class EmployeesController extends AbstractControler {

	public EmployeesController(AbstractModel art) {
		super(art);
		// TODO Auto-generated constructor stub
	}
	@Override
	void control() {
		// TODO Auto-generated method stub
		
	}
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		
		return this.monEmployeeManagement.getAll();

	}
	public ArrayList<Employee> getEmployeesOnly() {
		// TODO Auto-generated method stub
		return (ArrayList<Employee>) this.monEmployeeManagement.getEmployeesOnly();
	}
	public ArrayList<Employee> getChefOnly() {
		// TODO Auto-generated method stub
		return (ArrayList<Employee>) this.monEmployeeManagement.getChefOnly();
	}
	public boolean addEmployee(String nomEm, String prenomEm, String username, String password, String role) {
		// TODO Auto-generated method stub
		Employee NewE = new Employee(nomEm,prenomEm,username,password,role);
		return this.monEmployeeManagement.addEmp(NewE);
	}
	public void OpenDashbord(JFrame frame) {
		// TODO Auto-generated method stub
		Dashbord dash = new Dashbord();
		dash.frame.setVisible(true);
		frame.setVisible(false);
	}
	
	
}
