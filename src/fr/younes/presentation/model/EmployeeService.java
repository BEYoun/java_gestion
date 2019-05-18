package fr.younes.presentation.model;

import java.util.ArrayList;

import fr.younes.metier.Employee;
import fr.younes.presentation.controller.EmployeesController;

public class EmployeeService {
	private static EmployeeService instance;
	
	AbstractModel amdl;
	EmployeesController ectl=new EmployeesController(amdl);
	private ArrayList<Employee> employees = (ArrayList<Employee>) ectl.getEmployees();
	
	
	public static synchronized EmployeeService getInstance() {
		if (instance == null) {
			instance = new EmployeeService();
		}
		return instance;
	}

	public synchronized ArrayList<Employee> findLastNotes() {
		chargerDepuisBaseDeDonnees();
		return employees;
	}
	private void chargerDepuisBaseDeDonnees() {

		if (employees != null) {
			return;
		}

		
		

	}
}
