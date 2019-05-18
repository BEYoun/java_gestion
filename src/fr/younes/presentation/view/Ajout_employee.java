package fr.younes.presentation.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import fr.younes.metier.Employee;
import fr.younes.presentation.controller.EmployeesController;
import fr.younes.presentation.controller.ProcessusController;
import fr.younes.presentation.model.AbstractModel;

public class Ajout_employee {

	public JFrame frame;
	private JTextField txtSearch;
	int xMouse;
	int yMouse;

	AbstractModel amdl;
	EmployeesController ectl=new EmployeesController(amdl);
	ProcessusController pctl=new ProcessusController(amdl);
	ArrayList<Employee> employees;
	ArrayList<Employee> chef;
	private JTextField nom;
	private JTextField userName;
	private JTextField prenom;
	private JTextField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ajout_employee window = new Ajout_employee();
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
	public Ajout_employee() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 995, 570);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		javax.swing.border.Border emptyBorder = BorderFactory.createEmptyBorder();
		JSeparator separator = new JSeparator();
		separator.setBounds(75, 46, 193, 31);
		frame.getContentPane().add(separator);

		frame.setUndecorated(true);
		frame.setBackground(new Color(0,0,0,0));
		ImageIcon icon = new ImageIcon("img/document_add_256_icon-icons.com_75994.png");
		 Image img = icon.getImage() ;  
		   Image newimg = img.getScaledInstance( 50, 50,  java.awt.Image.SCALE_SMOOTH ) ;  
		   icon = new ImageIcon( newimg );
		ImageIcon icon2 = new ImageIcon("img/Edit-validated-icon.png");
		Image img2 = icon2.getImage() ;  
		Image newimg2 = img2.getScaledInstance( 50, 50,  java.awt.Image.SCALE_SMOOTH ) ;  
		icon2 = new ImageIcon( newimg2 );
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setMargin(new Insets(20, 0, 0, 0));
		menuBar.setBackground(Color.DARK_GRAY);
		menuBar.setBounds(0, 6, 73, 72);
		frame.getContentPane().add(menuBar);
		
		JMenu menu = new JMenu("");
		menuBar.add(menu);
		
		JMenuItem Employer = new JMenuItem("Employer");
		Employer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ectl.OpenDashbord(frame);
			}
		});
		menu.add(Employer);
		JMenuItem mntmHello = new JMenuItem("Procedure");
		mntmHello.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		menu.add(mntmHello);
		JMenuItem mnuNewFile = new JMenuItem( "Etape" );
		mnuNewFile.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		menu.add(mnuNewFile);
		JMenuItem menuAffectation = new JMenuItem( "Affectation" );
		menuAffectation.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pctl.openAffectation(frame);
			}
		});
		menu.add(menuAffectation);
		menu.setIcon(new ImageIcon("img/icons8-menu-64.png"));
		menu.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(138, 174, 685, 345);
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Ajout Employee");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(5, 2, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_1.add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_2 = new JLabel("Nom");
		panel_3.add(lblNewLabel_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.LIGHT_GRAY);
		panel_1.add(panel_4);
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		nom = new JTextField();
		panel_4.add(nom);
		nom.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_1.add(panel_7);
		
		JLabel lblNewLabel_5 = new JLabel("prenom");
		panel_7.add(lblNewLabel_5);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		panel_1.add(panel_8);
		
		prenom = new JTextField();
		panel_8.add(prenom);
		prenom.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_1.add(panel_5);
		panel_5.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_4 = new JLabel("username");
		panel_5.add(lblNewLabel_4);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.LIGHT_GRAY);
		panel_1.add(panel_6);
		panel_6.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		userName = new JTextField();
		panel_6.add(userName);
		userName.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.WHITE);
		panel_1.add(panel_11);
		
		JLabel lblNewLabel_7 = new JLabel("password");
		panel_11.add(lblNewLabel_7);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(Color.WHITE);
		panel_1.add(panel_12);
		
		pass = new JTextField();
		panel_12.add(pass);
		pass.setColumns(10);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.LIGHT_GRAY);
		panel_1.add(panel_9);
		
		JLabel lblNewLabel_6 = new JLabel("role");
		panel_9.add(lblNewLabel_6);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.LIGHT_GRAY);
		panel_1.add(panel_10);
		ButtonGroup group = new ButtonGroup();
		JRadioButton choixEmployee = new JRadioButton("employee");
		panel_10.add(choixEmployee);
		group.add(choixEmployee);
		JRadioButton choixChef = new JRadioButton("chef");
		panel_10.add(choixChef);
		group.add(choixChef);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel.add(panel_2, BorderLayout.SOUTH);
		
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String username = userName.getText();
				String password = pass.getText();
				String nomEm = nom.getText();
				String prenomEm = prenom.getText();
				String passwordEmp = pass.getText();
				Boolean choixE = choixEmployee.isSelected();
				Boolean choixC = choixChef.isSelected();
				boolean resultat=false;
				if(choixE || choixC) {
					if(choixE) {
						resultat=ectl.addEmployee(nomEm,prenomEm,username,passwordEmp,"employe");				
					}else{
						resultat=ectl.addEmployee(nomEm,prenomEm,username,passwordEmp,"chef");
					}
				}
				if(resultat) {
					
					JOptionPane.showMessageDialog(null, "Employee ajouter avec succes", "Succee", JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "Message d'erreur", "Erreur", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		panel_2.add(btnValider);
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("img/icons8-search-32.png"));
		lblNewLabel_3.setOpaque(false);
		lblNewLabel_3.setBounds(235, 25, 32, 23);
		frame.getContentPane().add(lblNewLabel_3);
		
		txtSearch = new JTextField();
		txtSearch.setForeground(new Color(0, 0, 0));
		txtSearch.setBackground(new Color(169, 169, 169));
		txtSearch.setToolTipText("");
		txtSearch.setBounds(75, 26, 165, 21);
		frame.getContentPane().add(txtSearch);
		txtSearch.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("YOUNES BEAILA");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(888, 11, 101, 21);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblYouAreLogin = new JLabel("You are login as Admin");
		lblYouAreLogin.setForeground(Color.WHITE);
		lblYouAreLogin.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblYouAreLogin.setBounds(772, 36, 142, 21);
		frame.getContentPane().add(lblYouAreLogin);
		
		JLabel lblLogOut = new JLabel("Logout ?");
		lblLogOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}
		});
		lblLogOut.setForeground(new Color(30, 144, 255));
		lblLogOut.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblLogOut.setBounds(924, 36, 65, 21);
		frame.getContentPane().add(lblLogOut);
		
		JPanel pnlMenu = new JPanel();
		pnlMenu.setBackground(new Color(128, 128, 128));
		pnlMenu.setBounds(0, 78, 999, 51);
		frame.getContentPane().add(pnlMenu);
		pnlMenu.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Dashbord");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ectl.OpenDashbord(frame);
			}
		});
		btnNewButton_1.setBorder(emptyBorder);
		btnNewButton_1.setForeground(new Color(192, 192, 192));
		btnNewButton_1.setBackground(new Color(128, 128, 128));
		btnNewButton_1.setIcon(new ImageIcon("img/icons8-home-32.png"));
		btnNewButton_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnNewButton_1.setBounds(84, 0, 136, 51);

		btnNewButton_1.setContentAreaFilled(false);
		pnlMenu.add(btnNewButton_1);
		
		JButton btnNews = new JButton("News");
		btnNews.setBorder(emptyBorder);
		btnNews.setIcon(new ImageIcon("img/icons8-news-32 (2).png"));
		btnNews.setForeground(Color.LIGHT_GRAY);
		btnNews.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnNews.setContentAreaFilled(false);
		btnNews.setBackground(Color.GRAY);
		btnNews.setBounds(275, 0, 136, 51);
		pnlMenu.add(btnNews);
		
		JButton button = new JButton("Dashbord");
		button.setBorder(emptyBorder);
		button.setIcon(new ImageIcon("img/icons8-ratings-32.png"));
		button.setForeground(Color.LIGHT_GRAY);
		button.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		button.setContentAreaFilled(false);
		button.setBackground(Color.GRAY);
		button.setBounds(476, 0, 136, 51);
		pnlMenu.add(button);
		
		JButton button_1 = new JButton("Dashbord");
		button_1.setBorder(emptyBorder);
		button_1.setIcon(new ImageIcon("img/icons8-ask-question-32.png"));
		button_1.setForeground(Color.LIGHT_GRAY);
		button_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		button_1.setContentAreaFilled(false);
		button_1.setBackground(Color.GRAY);
		button_1.setBounds(693, 0, 136, 51);
		pnlMenu.add(button_1);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xMouse=e.getX();
				yMouse=e.getY();
			}
		});
		lblBackground.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				int x = arg0.getXOnScreen();
				int y = arg0.getYOnScreen();
				frame.setLocation(x-xMouse, y-yMouse);
			}
		});
		lblBackground.setHorizontalAlignment(SwingConstants.LEFT);
		lblBackground.setIcon(new ImageIcon("img/Background2.png"));
		lblBackground.setBounds(0, 0, 1012, 612);
		frame.getContentPane().add(lblBackground);
		frame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{separator, lblNewLabel_3, txtSearch, lblNewLabel, lblYouAreLogin, lblLogOut, pnlMenu, btnNewButton_1, btnNews, button, button_1, lblBackground}));
	}
}
