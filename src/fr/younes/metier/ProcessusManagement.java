package fr.younes.metier;

import java.util.ArrayList;
import java.util.List;

import fr.younes.connection.SdzConnection;
import fr.younes.persistance.EmployeesDAO;
import fr.younes.persistance.ProcessusDAO;

public class ProcessusManagement {
	private Processus monProcessus;
	private ProcessusDAO pdao = new ProcessusDAO(SdzConnection.getInstance());
	
	public List<Processus> getProcessus() {
		// TODO Auto-generated method stub
		return pdao.listProcessus();
	}
}
