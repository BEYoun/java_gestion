package fr.younes.utile;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DropMode;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.TransferHandler;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;

//CTRL + SHIFT + O pour générer les imports
public class TreeDragDemo{
JTree tree;
static Color colors[] = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE,
	      Color.MAGENTA };

private  DefaultTreeCellRenderer tCellRenderer = new  DefaultTreeCellRenderer();
static void add(JTabbedPane tabbedPane, String label) {
    int count = tabbedPane.getTabCount();
    
    String nom = (count==1)?"employer 1":"chef admin 1";
    JLabel src = new JLabel(nom);
    
	  //------------------------------------------------------
	  //On utilise notre nouvel objet MyTransferHandle 
	  src.setTransferHandler(new MyTransferHandler());      
	  src.addMouseListener(new MouseAdapter(){
	       
		    public void mousePressed(MouseEvent e){
		      JComponent lab = (JComponent)e.getSource();
		      TransferHandler handle = lab.getTransferHandler();
		      handle.exportAsDrag(lab, e, TransferHandler.MOVE);
		    }
	  });
	//------------------------------------------------------
    tabbedPane.addTab(label, new ImageIcon("yourFile.gif"), src, label);
  }
public TreeDragDemo(JPanel panel){
		panel.setLayout(new BorderLayout());
	    
	  JPanel pan = new JPanel();
	  pan.setLayout(new GridLayout(1, 1));
	  pan.setBackground(Color.gray);
	  JLabel srcLib = new JLabel("Source de drag : ", JLabel.RIGHT);
	  JPanel pannel_gauche= new JPanel();
	  pannel_gauche.setLayout(new BorderLayout());
	  JTabbedPane mesOnglet = new JTabbedPane();
	  mesOnglet.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
	    String titles[] = { "Chef administratif", "Employer" };
	    for (int i = 0, n = titles.length; i < n; i++) {
	    	add(mesOnglet, titles[i]);
	    	
	    }

	    pannel_gauche.add(mesOnglet, BorderLayout.CENTER);
	  
	    
	  JLabel destLib = new JLabel("Destination de drag : ", JLabel.RIGHT);
	  JTextField dest = new JTextField();
	    
	  dest.setDragEnabled(true);
	  tree = new JTree(getModel());
	  tree.setDragEnabled(true);
	  ImageIcon icon = new ImageIcon("img/telephone-operator.png");
		 Image img = icon.getImage() ;  
		   Image newimg = img.getScaledInstance( 25, 25,  java.awt.Image.SCALE_SMOOTH ) ;
		   icon = new ImageIcon(newimg);
	    this.tCellRenderer.setClosedIcon(null);
	    this.tCellRenderer.setOpenIcon(null);
	    this.tCellRenderer.setLeafIcon(icon);
	  tree.setCellRenderer(tCellRenderer);
	  tree.setTransferHandler(new TreeTransferHandler(tree));
	  tree.setBackground(Color.WHITE);
	  pannel_gauche.add(mesOnglet);
	  pan.add(pannel_gauche);
	    
	  pan.add(new JScrollPane(tree));
	    
	  //Pour le choix des actions
	  JComboBox combo = new JComboBox();
	  combo.addItem("USE_SELECTION");
	  combo.addItem("ON");
	  combo.addItem("INSERT");
	  combo.addItem("ON_OR_INSERT");
	    
	  combo.addItemListener(new ItemListener(){
	
	    public void itemStateChanged(ItemEvent event) {
	      String value = event.getItem().toString();
	          
	      if(value.equals("USE_SELECTION"))
	        tree.setDropMode(DropMode.USE_SELECTION);
	
	      if(value.equals("ON"))
	        tree.setDropMode(DropMode.ON);            
	
	      if(value.equals("INSERT"))
	        tree.setDropMode(DropMode.INSERT);
	
	      if(value.equals("ON_OR_INSERT"))
	        tree.setDropMode(DropMode.ON_OR_INSERT);
	
	    }         
	  });
	    
	  panel.add(pan, BorderLayout.CENTER);
	  panel.add(combo, BorderLayout.SOUTH);
	}
	
	private TreeModel getModel(){
		DefaultMutableTreeNode principale = new DefaultMutableTreeNode("Affectation");
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Procedure");
		
		DefaultMutableTreeNode forum = new DefaultMutableTreeNode("etape1");
		forum.add(new DefaultMutableTreeNode("document 1"));
		forum.add(new DefaultMutableTreeNode("document 2"));
		forum.add(new DefaultMutableTreeNode("Document 3"));
		    
		DefaultMutableTreeNode tuto = new DefaultMutableTreeNode("etape2");
		tuto.add(new DefaultMutableTreeNode("document 1"));
		tuto.add(new DefaultMutableTreeNode("document 2"));
		tuto.add(new DefaultMutableTreeNode("document 3"));
		    
		root.add(tuto);
		 root.add(forum);
		  principale.add(root);
	
	  return new DefaultTreeModel(principale);
	}

  
}