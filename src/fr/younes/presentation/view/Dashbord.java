package fr.younes.presentation.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import org.eclipse.wb.swing.FocusTraversalOnArray;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class Dashbord {

	public JFrame frame;
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
		
		JPanel panel = new JPanel();
		panel.setBounds(88, 168, 800, 340);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel.add(panel_1);
		
		JButton btnNewButton_2 = new JButton("Ajout");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(new Color(105, 105, 105));
		btnNewButton_2.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnNewButton_2.setBounds(0, 0, 417, 199);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_1.setLayout(null);
		panel_1.add(btnNewButton_2);
		ImageIcon icon = new ImageIcon("img/document_add_256_icon-icons.com_75994.png");
		 Image img = icon.getImage() ;  
		   Image newimg = img.getScaledInstance( 50, 50,  java.awt.Image.SCALE_SMOOTH ) ;  
		   icon = new ImageIcon( newimg );
		   btnNewButton_2.setBorder(emptyBorder);
		   
		btnNewButton_2.setIcon(icon);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("Modifier");
		btnNewButton_3.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnNewButton_3.setBorder(emptyBorder);
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBackground(new Color(105, 105, 105));
		ImageIcon icon2 = new ImageIcon("img/Edit-validated-icon.png");
		Image img2 = icon2.getImage() ;  
		Image newimg2 = img2.getScaledInstance( 50, 50,  java.awt.Image.SCALE_SMOOTH ) ;  
		icon2 = new ImageIcon( newimg2 );
		btnNewButton_3.setIcon(icon2);
		btnNewButton_3.setBounds(-17, 0, 417, 204);
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton = new JButton("Archiver");
		btnNewButton.setBackground(new Color(105, 105, 105));
		panel.add(btnNewButton);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBackground(new Color(105, 105, 105));
		panel.add(btnNewButton_4);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setMargin(new Insets(20, 0, 0, 0));
		menuBar.setBackground(Color.DARK_GRAY);
		menuBar.setBounds(0, 6, 73, 72);
		frame.getContentPane().add(menuBar);
		
		JMenu menu = new JMenu("");
		menuBar.add(menu);
		
		JMenuItem Employer = new JMenuItem("Employer");
		menu.add(Employer);
		JMenuItem Chef = new JMenuItem( "Chef administratif" );
		menu.add(Chef);
		JMenuItem mntmHello = new JMenuItem("Employer");
		menu.add(mntmHello);
		JMenuItem mnuNewFile = new JMenuItem( "Chef administratif" );
		menu.add(mnuNewFile);
		menu.setIcon(new ImageIcon("img/icons8-menu-64.png"));
		menu.setHorizontalAlignment(SwingConstants.CENTER);
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
