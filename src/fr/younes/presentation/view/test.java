package fr.younes.presentation.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class test {
	public static void main(String argv[]) {
		
		JFrame f = new JFrame("ma fenetre");
		
		f.setSize(100,200);
		
		JPanel pannel = new JPanel();
		
		JLabel jLabel1 =new JLabel("Mon texte dans JLabel 1");
		
		jLabel1.setBackground(Color.red);
		
		pannel.add(jLabel1);
		
		f.setUndecorated(true);
		f.setBackground(new Color(0,0,0,0));
		
		JLabel jLabel2 =new JLabel("Mon texte dans JLabel 2");
	
		jLabel2.setBackground(Color.red);
		
		jLabel2.setOpaque(true);
	
		pannel.add(jLabel2);

		 
	
		f.getContentPane().add(pannel);
	
		f.setVisible(true);
		
		}
}
