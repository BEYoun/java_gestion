package fr.younes.presentation.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;

import fr.younes.metier.User;
import fr.younes.presentation.controller.UserController;
import fr.younes.presentation.model.AbstractModel;

public class LoginView {

	private JFrame frame;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JButton btnNewButton;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	AbstractModel amdl;
	UserController actl=new UserController(amdl);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView window = new LoginView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 482, 362);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 2, 0, 0));
		
		lblNewLabel = new JLabel("USERNAME :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new CompoundBorder());
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(0, 32, 86, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_1 = new JLabel("PASSWORD :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1);
		
		panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(0, 31, 86, 20);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		panel_1 = new JPanel();
		panel.add(panel_1);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		btnNewButton = new JButton("LOGIN");
		btnNewButton.setBounds(10, 11, 112, 41);
		panel_4.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String username = textField.getText();
				String password = textField_1.getText();
				List<User> users = actl.getUsers();
				
				for (User user : users) {
					if(username.equals(user.getUsername())  && password.equals(user.getPassword())) {
						System.out.println("trouver");
					}
				}
			}
		});
		
	}
}
