import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.db4o.ObjectSet;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Canvas;
import java.awt.TextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import java.util.ListIterator;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frmBiblio;
	private JTextField isbn_livre;
	private JTextField nomauteur;
	private JTextField prenomauteur;
	private JTextField maisonedition;
	private Biblioteque bib;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmBiblio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBiblio = new JFrame();
		frmBiblio.setTitle("BIBLIO");
		frmBiblio.setResizable(false);
		frmBiblio.setBounds(100, 100, 542, 519);
		frmBiblio.getContentPane().setBackground(new Color(51, 204, 102));
		frmBiblio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBiblio.getContentPane().setLayout(null);
		bib=new Biblioteque();
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 516, 468);
		tabbedPane.setBackground(new Color(0, 153, 102));
		frmBiblio.getContentPane().add(tabbedPane);
		
		JPanel panel_livres = new JPanel();
		panel_livres.setBackground(new Color(0, 153, 102));
		tabbedPane.addTab("Livres", null, panel_livres, null);
		panel_livres.setLayout(null);
		
		JButton btnCherecherlivre = new JButton("Cherecher");
		btnCherecherlivre.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 153, 102), new Color(0, 153, 102), new Color(0, 51, 0), new Color(0, 51, 0)));
		btnCherecherlivre.setBackground(new Color(0, 51, 0));
		btnCherecherlivre.setForeground(new Color(255, 255, 255));
		
		btnCherecherlivre.setFont(new Font("Century Gothic", Font.BOLD, 13));
		btnCherecherlivre.setBounds(391, 37, 110, 31);
		panel_livres.add(btnCherecherlivre);
		
		JButton btnListerlivres = new JButton("Lister");
		btnListerlivres.setForeground(new Color(255, 255, 255));
		btnListerlivres.setBackground(new Color(0, 51, 0));
		btnListerlivres.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 153, 102), new Color(0, 153, 102), new Color(0, 51, 0), new Color(0, 51, 0)));
		
		btnListerlivres.setFont(new Font("Century Gothic", Font.BOLD, 13));
		btnListerlivres.setBounds(278, 96, 110, 31);
		panel_livres.add(btnListerlivres);
		
		isbn_livre = new JTextField();
		isbn_livre.setBorder(new LineBorder(new Color(0, 51, 0), 2, true));
		isbn_livre.setForeground(new Color(255, 255, 255));
		isbn_livre.setBackground(new Color(0, 153, 102));
		isbn_livre.setHorizontalAlignment(SwingConstants.CENTER);
		isbn_livre.setFont(new Font("Century Gothic", Font.BOLD, 13));
		isbn_livre.setBounds(188, 38, 187, 30);
		panel_livres.add(isbn_livre);
		isbn_livre.setColumns(10);
		
		JLabel lblIsbnDuLivre = new JLabel("ISBN du livre \u00E0 chercher");
		lblIsbnDuLivre.setForeground(new Color(255, 255, 255));
		lblIsbnDuLivre.setHorizontalAlignment(SwingConstants.CENTER);
		lblIsbnDuLivre.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblIsbnDuLivre.setBounds(10, 37, 168, 31);
		panel_livres.add(lblIsbnDuLivre);
		
		TextArea livresArea = new TextArea();
		livresArea.setBackground(new Color(0, 153, 102));
		livresArea.setForeground(new Color(0, 51, 0));
		livresArea.setFont(new Font("Century Gothic", Font.BOLD, 13));
		livresArea.setEditable(false);
		livresArea.setBounds(0, 150, 511, 290);
		panel_livres.add(livresArea);
		
		JButton btnajouterlivre = new JButton("Ajouter");
		btnajouterlivre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Fenetreajouterlivre window = new Fenetreajouterlivre();
							window.getFrame().setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			
			}
		});
		btnajouterlivre.setForeground(Color.WHITE);
		btnajouterlivre.setFont(new Font("Century Gothic", Font.BOLD, 13));
		btnajouterlivre.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 153, 102), new Color(0, 153, 102), new Color(0, 51, 0), new Color(0, 51, 0)));
		btnajouterlivre.setBackground(new Color(0, 51, 0));
		btnajouterlivre.setBounds(111, 96, 110, 31);
		panel_livres.add(btnajouterlivre);
		
		JPanel panel_auteurs = new JPanel();
		panel_auteurs.setBackground(new Color(0, 153, 102));
		tabbedPane.addTab("Auteurs", null, panel_auteurs, null);
		panel_auteurs.setLayout(null);
		
		JButton btnCherecherauteur = new JButton("Cherecher");
		btnCherecherauteur.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 153, 102), new Color(0, 153, 102), new Color(0, 51, 0), new Color(0, 51, 0)));
		btnCherecherauteur.setBackground(new Color(0, 51, 0));
		btnCherecherauteur.setForeground(new Color(255, 255, 255));
		btnCherecherauteur.setFont(new Font("Century Gothic", Font.BOLD, 13));
		btnCherecherauteur.setBounds(391, 32, 110, 31);
		panel_auteurs.add(btnCherecherauteur);
		
		JButton btnListerauteurs = new JButton("Lister");
		btnListerauteurs.setBackground(new Color(0, 51, 0));
		btnListerauteurs.setForeground(new Color(255, 255, 255));
		btnListerauteurs.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 153, 102), new Color(0, 153, 102), new Color(0, 51, 0), new Color(0, 51, 0)));
		
		btnListerauteurs.setFont(new Font("Century Gothic", Font.BOLD, 13));
		btnListerauteurs.setBounds(190, 101, 110, 31);
		panel_auteurs.add(btnListerauteurs);
		
		TextArea auteursArea = new TextArea();
		auteursArea.setFont(new Font("Century Gothic", Font.BOLD, 13));
		auteursArea.setForeground(new Color(0, 51, 0));
		auteursArea.setBackground(new Color(0, 153, 102));
		auteursArea.setEditable(false);
		auteursArea.setBounds(0, 150, 511, 290);
		panel_auteurs.add(auteursArea);
		
		nomauteur = new JTextField();
		nomauteur.setForeground(new Color(255, 255, 255));
		nomauteur.setBorder(new LineBorder(new Color(0, 51, 0), 2, true));
		nomauteur.setBackground(new Color(0, 153, 102));
		nomauteur.setHorizontalAlignment(SwingConstants.CENTER);
		nomauteur.setFont(new Font("Century Gothic", Font.BOLD, 13));
		nomauteur.setColumns(10);
		nomauteur.setBounds(179, 11, 187, 30);
		panel_auteurs.add(nomauteur);
		
		prenomauteur = new JTextField();
		prenomauteur.setBorder(new LineBorder(new Color(0, 51, 0), 2, true));
		prenomauteur.setBackground(new Color(0, 153, 102));
		prenomauteur.setForeground(new Color(255, 255, 255));
		prenomauteur.setHorizontalAlignment(SwingConstants.CENTER);
		prenomauteur.setFont(new Font("Century Gothic", Font.BOLD, 13));
		prenomauteur.setColumns(10);
		prenomauteur.setBounds(179, 50, 187, 30);
		panel_auteurs.add(prenomauteur);
		
		JLabel nomauteurl = new JLabel("Nom auteur");
		nomauteurl.setForeground(new Color(255, 255, 255));
		nomauteurl.setHorizontalAlignment(SwingConstants.CENTER);
		nomauteurl.setFont(new Font("Century Gothic", Font.BOLD, 13));
		nomauteurl.setBounds(10, 10, 140, 31);
		panel_auteurs.add(nomauteurl);
		
		JLabel lblPrenomAuteur = new JLabel("Prenom auteur");
		lblPrenomAuteur.setForeground(new Color(255, 255, 255));
		lblPrenomAuteur.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrenomAuteur.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblPrenomAuteur.setBounds(20, 53, 140, 31);
		panel_auteurs.add(lblPrenomAuteur);
		
		JPanel panel_editeurs = new JPanel();
		panel_editeurs.setBackground(new Color(0, 153, 102));
		tabbedPane.addTab("Editeurs", null, panel_editeurs, null);
		panel_editeurs.setLayout(null);
		
		JButton btnCherecherediteur = new JButton("Cherecher");
		btnCherecherediteur.setForeground(new Color(255, 255, 255));
		btnCherecherediteur.setBackground(new Color(0, 51, 0));
		btnCherecherediteur.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 153, 102), new Color(0, 153, 102), new Color(0, 51, 0), new Color(0, 51, 0)));
		btnCherecherediteur.setFont(new Font("Century Gothic", Font.BOLD, 13));
		btnCherecherediteur.setBounds(391, 36, 110, 31);
		panel_editeurs.add(btnCherecherediteur);
		
		JButton btnListerediteurs = new JButton("Lister");
		btnListerediteurs.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 153, 102), new Color(0, 153, 102), new Color(0, 51, 0), new Color(0, 51, 0)));
		btnListerediteurs.setBackground(new Color(0, 51, 0));
		btnListerediteurs.setForeground(new Color(255, 255, 255));

		btnListerediteurs.setFont(new Font("Century Gothic", Font.BOLD, 13));
		btnListerediteurs.setBounds(199, 98, 110, 31);
		panel_editeurs.add(btnListerediteurs);
		
		TextArea editeursArea = new TextArea();
		editeursArea.setFont(new Font("Century Gothic", Font.BOLD, 13));
		editeursArea.setForeground(new Color(0, 51, 0));
		editeursArea.setBackground(new Color(0, 153, 102));
		editeursArea.setEditable(false);
		editeursArea.setBounds(0, 150, 511, 290);
		panel_editeurs.add(editeursArea);
		
		maisonedition = new JTextField();
		maisonedition.setBorder(new LineBorder(new Color(0, 51, 0), 2, true));
		maisonedition.setBackground(new Color(0, 153, 102));
		maisonedition.setForeground(new Color(255, 255, 255));
		maisonedition.setHorizontalAlignment(SwingConstants.CENTER);
		maisonedition.setFont(new Font("Century Gothic", Font.BOLD, 13));
		maisonedition.setColumns(10);
		maisonedition.setBounds(179, 37, 187, 30);
		panel_editeurs.add(maisonedition);
		
		JLabel maisoneditionl = new JLabel("Nom maison d'\u00E9dition");
		maisoneditionl.setForeground(new Color(255, 255, 255));
		maisoneditionl.setHorizontalAlignment(SwingConstants.CENTER);
		maisoneditionl.setFont(new Font("Century Gothic", Font.BOLD, 13));
		maisoneditionl.setBounds(10, 36, 159, 31);
		panel_editeurs.add(maisoneditionl);
		btnListerlivres.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				

	    		Runnable myRunnable =
	    			    new Runnable(){
	    			        public void run(){
	    			        	
	    			    		LinkedList<Object> t=bib.listerlivre();
	    			    		ListIterator<Object> it = t.listIterator();
	    			    		livresArea.setText("");
	    			    		while(it.hasNext()) {
	    			    			
	    			    			livresArea.append(it.next()+"\n__________________________________________________________________________________\n");
	    			    		}
	    						
	    						
	    			        }
	    			    };
	            
			    Thread thread = new Thread(myRunnable);
			    thread.start();
				
				
			}
		});
		btnListerauteurs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

	    		Runnable myRunnable =
	    			    new Runnable(){
	    			        public void run(){
	    			        	
	    			    		LinkedList<Object> t=bib.listerauteur();
	    			    		ListIterator<Object> it = t.listIterator();
	    			    		auteursArea.setText("");
	    			    		while(it.hasNext()) {
	    			    			
	    			    			auteursArea.append(it.next()+"\n__________________________________________________________________________________\n");
	    			    		}
	    						
	    						
	    			        }
	    			    };
	            
			    Thread thread = new Thread(myRunnable);
			    thread.start();
			}
		});
		
		btnListerediteurs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

	    		Runnable myRunnable =
	    			    new Runnable(){
	    			        public void run(){
	    			        	
	    			    		LinkedList<Object> t=bib.listerediteur();
	    			    		ListIterator<Object> it = t.listIterator();
	    			    		editeursArea.setText("");
	    			    		while(it.hasNext()) {
	    			    			
	    			    			editeursArea.append(it.next()+"\n__________________________________________________________________________________\n");
	    			    		}
	    						
	    						
	    			        }
	    			    };
	            
			    Thread thread = new Thread(myRunnable);
			    thread.start();
			}
		});
		
		btnCherecherlivre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Object o=bib.rechercherlivre(isbn_livre.getText());
				livresArea.setText("");
				if(o!=null) {
					livresArea.setText("");
					livresArea.append(o+"\n");
					
				}else {
					JOptionPane.showMessageDialog(frmBiblio,"Aucun livre ne correspond a l'ISBN: "+isbn_livre.getText(),
							"Introuvale",JOptionPane.ERROR_MESSAGE); 
					
					
				}
				isbn_livre.setText("");
				
			}
		});
		btnCherecherauteur.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Object o=bib.rechercherauteur(nomauteur.getText(), prenomauteur.getText());
				auteursArea.setText("");
				if(o!=null) {
					auteursArea.setText("");
					auteursArea.append(o+"\n");
					
				}else {
					JOptionPane.showMessageDialog(frmBiblio,"L'auteur: "+nomauteur.getText()+" "+prenomauteur.getText()+" est introuvable",
							"Introuvale",JOptionPane.ERROR_MESSAGE); 
					
					
				}
				nomauteur.setText("");
				prenomauteur.setText("");
				
			}
		});
		
		btnCherecherediteur.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Object o=bib.rechercherediteur(maisonedition.getText());
				editeursArea.setText("");
				if(o!=null) {
					editeursArea.setText("");
					editeursArea.append(o+"\n");
					
				}else {
					JOptionPane.showMessageDialog(frmBiblio,"L'edition : "+maisonedition.getText()+" est introuvable",
							"Introuvale",JOptionPane.ERROR_MESSAGE); 
					
					
				}
				maisonedition.setText("");
				
			}
		});
	}
}
