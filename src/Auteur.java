import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class Auteur {
	private Integer idauteur;
	private String nom;
	private String prenom;
	private String datenaissance;
	private String lieunaissance;
	private String adresse;
	
	public Auteur(Integer idauteur,String nom,String prenom,String datenaissance,String lieunaissance,String adresse) {
		this.idauteur=idauteur;
		this.nom=nom;
		this.prenom=prenom;
		this.datenaissance=datenaissance;
		this.lieunaissance=lieunaissance;
		this.adresse=adresse;
	}
	


	
	public Integer getIdauteur() {
		return idauteur;
	}
	public void setIdauteur(Integer idauteur) {
		this.idauteur = idauteur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getDatenaissance() {
		return datenaissance;
	}
	public void setDatenaissance(String datenaissance) {
		this.datenaissance = datenaissance;
	}
	public String getLieunaissance() {
		return lieunaissance;
	}
	public void setLieunaissance(String lieunaissance) {
		this.lieunaissance = lieunaissance;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String toString() {
		return "\n- Nom= " + nom + "\n- Prenom= " + prenom + "\n- Date de naissance= " + datenaissance + "\n- Lieu de naissance= "
				+ lieunaissance + "\n- Adresse= " + adresse ;
	}
	

}
