package fr.younes.presentation.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import org.eclipse.wb.swing.FocusTraversalOnArray;
import javax.swing.JMenuBar;
import java.awt.Insets;

public class Dashbord {

	private JFrame frame;
	private JTextField txtSearch;
	int xMouse;
	int yMouse;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the application.
	 */
	public Dashbord() {
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
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setMargin(new Insets(20, 0, 0, 0));
		menuBar.setBackground(Color.DARK_GRAY);
		menuBar.setBounds(0, 6, 73, 72);
		frame.getContentPane().add(menuBar);
		
		JMenu menu = new JMenu("");
		menuBar.add(menu);
		
		JMenuItem mntmHello = new JMenuItem("hello");
		menu.add(mntmHello);
		JMenuItem mnuNewFile = new JMenuItem( "New File" );
		menu.add(mnuNewFile);
		menu.setIcon(new ImageIcon("C:\\Users\\younesbe\\eclipse-workspace\\Peojet_gestion\\img\\icons8-menu-64.png"));
		menu.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\younesbe\\eclipse-workspace\\Peojet_gestion\\img\\icons8-search-32.png"));
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
		btnNewButton_1.setBorder(emptyBorder);
		btnNewButton_1.setForeground(new Color(192, 192, 192));
		btnNewButton_1.setBackground(new Color(128, 128, 128));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\younesbe\\eclipse-workspace\\Peojet_gestion\\img\\icons8-home-32.png"));
		btnNewButton_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnNewButton_1.setBounds(84, 0, 136, 51);

		btnNewButton_1.setContentAreaFilled(false);
		pnlMenu.add(btnNewButton_1);
		
		JButton btnNews = new JButton("News");
		btnNews.setBorder(emptyBorder);
		btnNews.setIcon(new ImageIcon("C:\\Users\\younesbe\\eclipse-workspace\\Peojet_gestion\\img\\icons8-news-32 (2).png"));
		btnNews.setForeground(Color.LIGHT_GRAY);
		btnNews.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnNews.setContentAreaFilled(false);
		btnNews.setBackground(Color.GRAY);
		btnNews.setBounds(275, 0, 136, 51);
		pnlMenu.add(btnNews);
		
		JButton button = new JButton("Dashbord");
		button.setBorder(emptyBorder);
		button.setIcon(new ImageIcon("C:\\Users\\younesbe\\eclipse-workspace\\Peojet_gestion\\img\\icons8-ratings-32.png"));
		button.setForeground(Color.LIGHT_GRAY);
		button.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		button.setContentAreaFilled(false);
		button.setBackground(Color.GRAY);
		button.setBounds(476, 0, 136, 51);
		pnlMenu.add(button);
		
		JButton button_1 = new JButton("Dashbord");
		button_1.setBorder(emptyBorder);
		button_1.setIcon(new ImageIcon("C:\\Users\\younesbe\\eclipse-workspace\\Peojet_gestion\\img\\icons8-ask-question-32.png"));
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
		lblBackground.setIcon(new ImageIcon("C:\\Users\\younesbe\\eclipse-workspace\\Peojet_gestion\\img\\Background2.png"));
		lblBackground.setBounds(0, 0, 1012, 612);
		frame.getContentPane().add(lblBackground);
		frame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{separator, lblNewLabel_3, txtSearch, lblNewLabel, lblYouAreLogin, lblLogOut, pnlMenu, btnNewButton_1, btnNews, button, button_1, lblBackground}));
	}
}
