package fr.younes.metier;

public class Processus {
	private int id;
	private String nom;
	private Employee employee;
	public Processus() {
		
	}
	public Processus(int id,String nom, Employee emp) {
		this.id=id;
		this.nom=nom;
		this.employee=emp;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmp_id(Employee emp_id) {
		this.employee = emp_id;
	}
}
