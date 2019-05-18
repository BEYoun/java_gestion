package fr.younes.presentation.controller;

import javax.swing.JFrame;

import fr.younes.presentation.model.AbstractModel;
import fr.younes.presentation.view.Dashbord_etape;

public class EtapesController extends AbstractControler{

	public EtapesController(AbstractModel art) {
		super(art);
		// TODO Auto-generated constructor stub
	}

	@Override
	void control() {
		// TODO Auto-generated method stub
		
	}

	public void openDashbord(JFrame frame) {
		// TODO Auto-generated method stub
		Dashbord_etape dash = new Dashbord_etape();
		dash.frame.setVisible(true);
		frame.setVisible(false);
	}

}
