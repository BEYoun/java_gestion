package fr.younes.presentation.controller;
import fr.younes.metier.EmployeeManagement;
import fr.younes.metier.EtapeManagement;
import fr.younes.metier.ProcessusManagement;
import fr.younes.metier.UserManagement;
import fr.younes.presentation.model.AbstractModel;

public abstract class AbstractControler {

	protected AbstractModel art;
	protected UserManagement monUserManagement;
	protected EmployeeManagement monEmployeeManagement;
	protected ProcessusManagement monProcessusManagement;
	protected EtapeManagement monEtapeManagement;
	public AbstractControler(AbstractModel art) {
		this.art=art;
		this.monUserManagement=new UserManagement();
		this.monEmployeeManagement= new EmployeeManagement();
		this.monProcessusManagement = new ProcessusManagement();
		this.monEtapeManagement = new EtapeManagement();
	}
	 abstract void control();
	
}
