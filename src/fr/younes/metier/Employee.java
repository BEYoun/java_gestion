package fr.younes.metier;

public class Employee {
	private int id;
	private String username;
	private String nom;
	private String prenom;
	private String password;
	private String role;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public Employee(int id, 
			String username, 
			String nom, 
			String prenom,
			String password, 
			String role) {
		super();
		this.id = id;
		this.username = username;
		this.nom= nom;
		this.prenom= prenom;
		this.password = password;
		this.role = role;
	}
	public Employee(
			String username, 
			String nom, 
			String prenom,
			String password, 
			String role) {
		super();
		this.username = username;
		this.nom= nom;
		this.prenom= prenom;
		this.password = password;
		this.role = role;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	


	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", role=" + role + "]";
	}

	
}
