package fr.younes.presentation.controller;

import java.util.List;

import fr.younes.metier.User;
import fr.younes.presentation.model.AbstractModel;

public class UserController extends AbstractControler {

	public UserController(AbstractModel art) {
		super(art);
		// TODO Auto-generated constructor stub
	}

	@Override
	void control() {
		// TODO Auto-generated method stub
		
	}

	public List<User> getUsers() {
		// TODO Auto-generated method stub
		
		return this.monUserManagement.getAll();
	}
}
