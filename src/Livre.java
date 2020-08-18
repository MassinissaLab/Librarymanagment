

public class Livre {
	

	private Integer idlivre;
	private String titre;
	private String isbn;
	private Auteur auteur;
	private Editeur editeur;
	private String anedition;
	private String domain;
	private String motscl�s ;
	
	
	public Livre(Integer idlivre, String titre, String isbn,Auteur auteur, Editeur editeur, String anedition,
			String domain, String motscl�s) {
	
		this.idlivre = idlivre;
		this.titre = titre;
		this.isbn = isbn;
		this.auteur = auteur;
		this.editeur = editeur;
		this.anedition = anedition;
		this.domain = domain;
		this.motscl�s = motscl�s;
	}
	
	public String toString() {
		return "[ID Livre : "+idlivre+"]\n- Titre = " + titre + "\n- ISBN = " + isbn +
				"\n- Ann�e d'�dition = " + anedition + "\n- Domaine = " + domain + "\n- Motscl�s = " + motscl�s+
				"\n[Auteur]" + auteur.toString() + "\n[Editeur]" + editeur.toString();
	}
	public Integer getIdlivre() {
		return idlivre;
	}
	public void setIdlivre(Integer idlivre) {
		this.idlivre = idlivre;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Auteur getAuteur() {
		return auteur;
	}
	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}
	public Editeur getEditeur() {
		return editeur;
	}
	public void setEditeur(Editeur editeur) {
		this.editeur = editeur;
	}
	public String getAnedition() {
		return anedition;
	}
	public void setAnedition(String anedition) {
		this.anedition = anedition;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getMotscl�s() {
		return motscl�s;
	}
	public void setMotscl�s(String motscl�s) {
		this.motscl�s = motscl�s;
	}
	
}
