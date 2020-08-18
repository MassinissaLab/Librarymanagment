import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.Bidi;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class Fenetreajouterlivre {

	private JFrame ajouterlivre;
	private JTextField titrelivre;
	private JTextField motscleslivre;
	private JTextField anneeeditionlivre;
	private JTextField isbnlivre;
	private JTextField domainelivre;
	private JTextField adresseauteur;
	private JTextField lieunaissanceauteur;
	private JTextField datenaissanceauteur;
	private JTextField prenomauteur;
	private JTextField nomauteur;
	private JTextField maisonedition;
	private JTextField adresseedition;
	private JLabel lblTitreLivre;
	private JLabel lblIsbnLivre;
	private JLabel nomauteurl_2;
	private JLabel lblDomaineLivre;
	private JLabel nomauteurl_4;
	private JLabel lblAnneditionLivre;
	private JLabel nomauteurl_6;
	private JLabel lblPrenomAuteur;
	private JLabel nomauteurl_8;
	private JLabel lblDatenaissance;
	private JLabel nomauteurl_10;
	private JLabel lblMaisondition;


	/**
	 * Create the application.
	 */
	public Fenetreajouterlivre() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 450, 542);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public JFrame getFrame() {
		return ajouterlivre;
	}

	public void setFrame(JFrame frame) {
		this.ajouterlivre = frame;
		ajouterlivre.setUndecorated(true);
		ajouterlivre.getContentPane().setBackground(new Color(51, 204, 102));
		ajouterlivre.getContentPane().setLayout(null);
		
		JButton btnajouterlivre = new JButton("Ajouter");
		btnajouterlivre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Biblioteque bib=new Biblioteque();
				
				Auteur aut=bib.ajouterauteur(nomauteur.getText(), prenomauteur.getText(), datenaissanceauteur.getText(),
						lieunaissanceauteur.getText(), adresseauteur.getText());
				
				Editeur edit=bib.ajouterediteur(maisonedition.getText(),adresseedition.getText());
				
				
				bib.ajouterlivre(titrelivre.getText(), isbnlivre.getText(), aut, edit,
						anneeeditionlivre.getText(), domainelivre.getText(), motscleslivre.getText());
				
				ajouterlivre.dispose();
				
				
			}
		});
		btnajouterlivre.setForeground(Color.WHITE);
		btnajouterlivre.setFont(new Font("Century Gothic", Font.BOLD, 13));
		btnajouterlivre.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 153, 102), new Color(0, 153, 102), new Color(0, 51, 0), new Color(0, 51, 0)));
		btnajouterlivre.setBackground(new Color(0, 51, 0));
		btnajouterlivre.setBounds(70, 500, 110, 31);
		ajouterlivre.getContentPane().add(btnajouterlivre);
		
		JButton btnannuler = new JButton("Annuler");
		btnannuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ajouterlivre.dispose();
			}
		});
		btnannuler.setForeground(Color.WHITE);
		btnannuler.setFont(new Font("Century Gothic", Font.BOLD, 13));
		btnannuler.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 153, 102), new Color(0, 153, 102), new Color(0, 51, 0), new Color(0, 51, 0)));
		btnannuler.setBackground(new Color(0, 51, 0));
		btnannuler.setBounds(251, 500, 110, 31);
		ajouterlivre.getContentPane().add(btnannuler);
		
		titrelivre = new JTextField();
		titrelivre.setHorizontalAlignment(SwingConstants.CENTER);
		titrelivre.setForeground(Color.WHITE);
		titrelivre.setFont(new Font("Century Gothic", Font.BOLD, 13));
		titrelivre.setColumns(10);
		titrelivre.setBorder(new LineBorder(new Color(0, 51, 0), 2, true));
		titrelivre.setBackground(new Color(0, 153, 102));
		titrelivre.setBounds(201, 11, 187, 30);
		ajouterlivre.getContentPane().add(titrelivre);
		
		motscleslivre = new JTextField();
		motscleslivre.setHorizontalAlignment(SwingConstants.CENTER);
		motscleslivre.setForeground(Color.WHITE);
		motscleslivre.setFont(new Font("Century Gothic", Font.BOLD, 13));
		motscleslivre.setColumns(10);
		motscleslivre.setBorder(new LineBorder(new Color(0, 51, 0), 2, true));
		motscleslivre.setBackground(new Color(0, 153, 102));
		motscleslivre.setBounds(201, 50, 187, 30);
		ajouterlivre.getContentPane().add(motscleslivre);
		
		anneeeditionlivre = new JTextField();
		anneeeditionlivre.setHorizontalAlignment(SwingConstants.CENTER);
		anneeeditionlivre.setForeground(Color.WHITE);
		anneeeditionlivre.setFont(new Font("Century Gothic", Font.BOLD, 13));
		anneeeditionlivre.setColumns(10);
		anneeeditionlivre.setBorder(new LineBorder(new Color(0, 51, 0), 2, true));
		anneeeditionlivre.setBackground(new Color(0, 153, 102));
		anneeeditionlivre.setBounds(201, 91, 187, 30);
		ajouterlivre.getContentPane().add(anneeeditionlivre);
		
		isbnlivre = new JTextField();
		isbnlivre.setHorizontalAlignment(SwingConstants.CENTER);
		isbnlivre.setForeground(Color.WHITE);
		isbnlivre.setFont(new Font("Century Gothic", Font.BOLD, 13));
		isbnlivre.setColumns(10);
		isbnlivre.setBorder(new LineBorder(new Color(0, 51, 0), 2, true));
		isbnlivre.setBackground(new Color(0, 153, 102));
		isbnlivre.setBounds(201, 132, 187, 30);
		ajouterlivre.getContentPane().add(isbnlivre);
		
		domainelivre = new JTextField();
		domainelivre.setHorizontalAlignment(SwingConstants.CENTER);
		domainelivre.setForeground(Color.WHITE);
		domainelivre.setFont(new Font("Century Gothic", Font.BOLD, 13));
		domainelivre.setColumns(10);
		domainelivre.setBorder(new LineBorder(new Color(0, 51, 0), 2, true));
		domainelivre.setBackground(new Color(0, 153, 102));
		domainelivre.setBounds(201, 173, 187, 30);
		ajouterlivre.getContentPane().add(domainelivre);
		
		adresseauteur = new JTextField();
		adresseauteur.setHorizontalAlignment(SwingConstants.CENTER);
		adresseauteur.setForeground(Color.WHITE);
		adresseauteur.setFont(new Font("Century Gothic", Font.BOLD, 13));
		adresseauteur.setColumns(10);
		adresseauteur.setBorder(new LineBorder(new Color(0, 51, 0), 2, true));
		adresseauteur.setBackground(new Color(0, 153, 102));
		adresseauteur.setBounds(201, 376, 187, 30);
		ajouterlivre.getContentPane().add(adresseauteur);
		
		lieunaissanceauteur = new JTextField();
		lieunaissanceauteur.setHorizontalAlignment(SwingConstants.CENTER);
		lieunaissanceauteur.setForeground(Color.WHITE);
		lieunaissanceauteur.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lieunaissanceauteur.setColumns(10);
		lieunaissanceauteur.setBorder(new LineBorder(new Color(0, 51, 0), 2, true));
		lieunaissanceauteur.setBackground(new Color(0, 153, 102));
		lieunaissanceauteur.setBounds(201, 335, 187, 30);
		ajouterlivre.getContentPane().add(lieunaissanceauteur);
		
		datenaissanceauteur = new JTextField();
		datenaissanceauteur.setHorizontalAlignment(SwingConstants.CENTER);
		datenaissanceauteur.setForeground(Color.WHITE);
		datenaissanceauteur.setFont(new Font("Century Gothic", Font.BOLD, 13));
		datenaissanceauteur.setColumns(10);
		datenaissanceauteur.setBorder(new LineBorder(new Color(0, 51, 0), 2, true));
		datenaissanceauteur.setBackground(new Color(0, 153, 102));
		datenaissanceauteur.setBounds(201, 294, 187, 30);
		ajouterlivre.getContentPane().add(datenaissanceauteur);
		
		prenomauteur = new JTextField();
		prenomauteur.setHorizontalAlignment(SwingConstants.CENTER);
		prenomauteur.setForeground(Color.WHITE);
		prenomauteur.setFont(new Font("Century Gothic", Font.BOLD, 13));
		prenomauteur.setColumns(10);
		prenomauteur.setBorder(new LineBorder(new Color(0, 51, 0), 2, true));
		prenomauteur.setBackground(new Color(0, 153, 102));
		prenomauteur.setBounds(201, 253, 187, 30);
		ajouterlivre.getContentPane().add(prenomauteur);
		
		nomauteur = new JTextField();
		nomauteur.setHorizontalAlignment(SwingConstants.CENTER);
		nomauteur.setForeground(Color.WHITE);
		nomauteur.setFont(new Font("Century Gothic", Font.BOLD, 13));
		nomauteur.setColumns(10);
		nomauteur.setBorder(new LineBorder(new Color(0, 51, 0), 2, true));
		nomauteur.setBackground(new Color(0, 153, 102));
		nomauteur.setBounds(201, 214, 187, 30);
		ajouterlivre.getContentPane().add(nomauteur);
		
		maisonedition = new JTextField();
		maisonedition.setHorizontalAlignment(SwingConstants.CENTER);
		maisonedition.setForeground(Color.WHITE);
		maisonedition.setFont(new Font("Century Gothic", Font.BOLD, 13));
		maisonedition.setColumns(10);
		maisonedition.setBorder(new LineBorder(new Color(0, 51, 0), 2, true));
		maisonedition.setBackground(new Color(0, 153, 102));
		maisonedition.setBounds(201, 418, 187, 30);
		ajouterlivre.getContentPane().add(maisonedition);
		
		adresseedition = new JTextField();
		adresseedition.setHorizontalAlignment(SwingConstants.CENTER);
		adresseedition.setForeground(Color.WHITE);
		adresseedition.setFont(new Font("Century Gothic", Font.BOLD, 13));
		adresseedition.setColumns(10);
		adresseedition.setBorder(new LineBorder(new Color(0, 51, 0), 2, true));
		adresseedition.setBackground(new Color(0, 153, 102));
		adresseedition.setBounds(201, 459, 187, 30);
		ajouterlivre.getContentPane().add(adresseedition);
		
		lblTitreLivre = new JLabel("Titre Livre");
		lblTitreLivre.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitreLivre.setForeground(new Color(0, 51, 0));
		lblTitreLivre.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblTitreLivre.setBounds(20, 11, 140, 31);
		ajouterlivre.getContentPane().add(lblTitreLivre);
		
		lblIsbnLivre = new JLabel("ISBN Livre");
		lblIsbnLivre.setHorizontalAlignment(SwingConstants.CENTER);
		lblIsbnLivre.setForeground(new Color(0, 51, 0));
		lblIsbnLivre.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblIsbnLivre.setBounds(20, 131, 140, 31);
		ajouterlivre.getContentPane().add(lblIsbnLivre);
		
		nomauteurl_2 = new JLabel("Mots cl\u00E9s Livre");
		nomauteurl_2.setHorizontalAlignment(SwingConstants.CENTER);
		nomauteurl_2.setForeground(new Color(0, 51, 0));
		nomauteurl_2.setFont(new Font("Century Gothic", Font.BOLD, 13));
		nomauteurl_2.setBounds(20, 49, 140, 31);
		ajouterlivre.getContentPane().add(nomauteurl_2);
		
		lblDomaineLivre = new JLabel("Domaine Livre");
		lblDomaineLivre.setHorizontalAlignment(SwingConstants.CENTER);
		lblDomaineLivre.setForeground(new Color(0, 51, 0));
		lblDomaineLivre.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblDomaineLivre.setBounds(20, 172, 140, 31);
		ajouterlivre.getContentPane().add(lblDomaineLivre);
		
		nomauteurl_4 = new JLabel("Nom auteur");
		nomauteurl_4.setHorizontalAlignment(SwingConstants.CENTER);
		nomauteurl_4.setForeground(new Color(0, 51, 0));
		nomauteurl_4.setFont(new Font("Century Gothic", Font.BOLD, 13));
		nomauteurl_4.setBounds(20, 213, 140, 31);
		ajouterlivre.getContentPane().add(nomauteurl_4);
		
		lblAnneditionLivre = new JLabel("Ann\u00E9e \u00E9dition Livre");
		lblAnneditionLivre.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnneditionLivre.setForeground(new Color(0, 51, 0));
		lblAnneditionLivre.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblAnneditionLivre.setBounds(20, 90, 140, 31);
		ajouterlivre.getContentPane().add(lblAnneditionLivre);
		
		nomauteurl_6 = new JLabel("Date Naissance auteur");
		nomauteurl_6.setHorizontalAlignment(SwingConstants.CENTER);
		nomauteurl_6.setForeground(new Color(0, 51, 0));
		nomauteurl_6.setFont(new Font("Century Gothic", Font.BOLD, 13));
		nomauteurl_6.setBounds(20, 292, 160, 31);
		ajouterlivre.getContentPane().add(nomauteurl_6);
		
		lblPrenomAuteur = new JLabel("Prenom auteur");
		lblPrenomAuteur.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrenomAuteur.setForeground(new Color(0, 51, 0));
		lblPrenomAuteur.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblPrenomAuteur.setBounds(20, 253, 140, 31);
		ajouterlivre.getContentPane().add(lblPrenomAuteur);
		
		nomauteurl_8 = new JLabel("Adresse auteur");
		nomauteurl_8.setHorizontalAlignment(SwingConstants.CENTER);
		nomauteurl_8.setForeground(new Color(0, 51, 0));
		nomauteurl_8.setFont(new Font("Century Gothic", Font.BOLD, 13));
		nomauteurl_8.setBounds(20, 375, 140, 31);
		ajouterlivre.getContentPane().add(nomauteurl_8);
		
		lblDatenaissance = new JLabel("Lieu Naissance auteur");
		lblDatenaissance.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatenaissance.setForeground(new Color(0, 51, 0));
		lblDatenaissance.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblDatenaissance.setBounds(20, 336, 160, 31);
		ajouterlivre.getContentPane().add(lblDatenaissance);
		
		nomauteurl_10 = new JLabel("Adresse \u00E9dition");
		nomauteurl_10.setHorizontalAlignment(SwingConstants.CENTER);
		nomauteurl_10.setForeground(new Color(0, 51, 0));
		nomauteurl_10.setFont(new Font("Century Gothic", Font.BOLD, 13));
		nomauteurl_10.setBounds(20, 457, 140, 31);
		ajouterlivre.getContentPane().add(nomauteurl_10);
		
		lblMaisondition = new JLabel("Maison \u00E9dition");
		lblMaisondition.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaisondition.setForeground(new Color(0, 51, 0));
		lblMaisondition.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblMaisondition.setBounds(20, 418, 140, 31);
		ajouterlivre.getContentPane().add(lblMaisondition);
		ajouterlivre.setBackground(new Color(0, 204, 153));
	}
}
