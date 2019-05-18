package fr.younes.presentation.controller;

import java.util.ArrayList;

import javax.swing.JFrame;

import fr.younes.metier.Processus;
import fr.younes.presentation.model.AbstractModel;
import fr.younes.presentation.view.Dashbord2;
import fr.younes.presentation.view.Dashbord_processus;

public class ProcessusController extends AbstractControler{

	public ProcessusController(AbstractModel art) {
		super(art);
		// TODO Auto-generated constructor stub
	}

	@Override
	void control() {
		// TODO Auto-generated method stub
		
	}
	public ArrayList<Processus> getProcessus() {
		// TODO Auto-generated method stub
		return (ArrayList<Processus>) this.monProcessusManagement.getProcessus();
	}

	public void openAffectation(JFrame frame) {
		// TODO Auto-generated method stub
		Dashbord2 dash = new Dashbord2();
		dash.frame.setVisible(true);
		frame.setVisible(false);
	}

	public void openDashbord(JFrame frame) {
		// TODO Auto-generated method stub
		Dashbord_processus dash = new Dashbord_processus();
		dash.frame.setVisible(true);
		frame.setVisible(false);
	}

}
