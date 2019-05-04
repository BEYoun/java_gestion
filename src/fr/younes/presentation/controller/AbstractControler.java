package fr.younes.presentation.controller;
import fr.younes.metier.UserManagement;
import fr.younes.presentation.model.AbstractModel;

public abstract class AbstractControler {

	protected AbstractModel art;
	protected UserManagement monUserManagement;
	public AbstractControler(AbstractModel art) {
		this.art=art;
		this.monUserManagement=new UserManagement();
	}
	 abstract void control();
	
}
