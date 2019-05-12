package fr.younes.presentation.controller;

import java.awt.EventQueue;
import java.util.List;

import fr.younes.metier.User;
import fr.younes.presentation.model.AbstractModel;
import fr.younes.presentation.view.Dashbord;

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
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashbord window = new Dashbord();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
