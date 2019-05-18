package fr.younes.presentation.model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import fr.younes.metier.Employee;

public class EmployeesModel extends AbstractTableModel{
	private final String[] entetes = { "Nom", "Prénom", "Username", "password", "Role" };	
	private EmployeeService noteService;
	private ArrayList<Employee> notes;
	
	public EmployeesModel() {
		noteService = EmployeeService.getInstance();
		notes = noteService.findLastNotes();
	}
	@Override
	public int getColumnCount() {
		return entetes.length;
	}

	@Override
	public String getColumnName(int columnIndex) {
		return entetes[columnIndex];
	}

	
	public List<Employee> getNotes() {
		return notes;
	}
	@Override
	public int getRowCount() {
		return notes.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {

		case 0:
			// Nom
			return notes.get(rowIndex).getNom();

		case 1:
			// Prenom
			return notes.get(rowIndex).getPrenom();

		case 2:
			// Annee
			return notes.get(rowIndex).getUsername();

		case 3:
			// Sexe
			return notes.get(rowIndex).getPassword();

		case 4:
			// Note au controle
			return notes.get(rowIndex).getRole();

		default:
			throw new IllegalArgumentException();
		}
	}
	@Override
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
			case 0:
			case 1:
				return String.class;
	
			case 3:
				return String.class;
	
			case 2:
				return String.class;
	
			case 4:
				return String.class;
	
			default:
				return String.class;
		}
	}

}
