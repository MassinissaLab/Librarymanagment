import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class Biblioteque {

 
	
	public Biblioteque() {
		
	}
public  LinkedList<Object> lister(List<?> result){
		
		LinkedList<Object> tmp =new LinkedList<>();
	
		for (Object o : result) {
			tmp.add(o);
			//System.out.println(o);
			
		}
		return tmp;
				}
	
	
public boolean ajouterlivre(String titre, String isbn,Auteur auteur, Editeur editeur, String anedition,
			String domain, String motsclés) {
		
		Livre tmp=null;
		
		ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"biblioteque");
		try {
			
			ObjectSet result = db.queryByExample(Livre.class);
			
			tmp=new Livre(result.size()+1,titre,isbn,auteur,editeur,anedition, domain, motsclés);
			ObjectSet existe = db.queryByExample(tmp);
			if(existe==null) {
				db.store(tmp);
			}
			else {
				return false;
			}
			
		} finally {
			db.close();
		}
		return true;
		
	}
	
public LinkedList<Object> listerlivre() {
		
		ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"biblioteque");
		ObjectSet result=null;
		LinkedList<Object> tmp=null;
		try {
			
			
			result = db.queryByExample(Livre.class);
			tmp=lister(result);
			
			
		} finally {
			
			db.close();
			
			
		}
		return tmp;
		
		
		
	}
	
	
public Object rechercherlivre(String isbn) {

		ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"biblioteque");
		LinkedList<Object> r=null;
		try {
			
			Livre tmp = new Livre(null,null,isbn,null,null,null,null,null);
			ObjectSet result = db.queryByExample(tmp);
			r=lister(result);
			return r.getFirst();
		}catch (NoSuchElementException e) {
			return null;
		} 
		
		finally {
			db.close();
			
		}
	}
public void supprimerlivre(String isbn) {

		ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"biblioteque");
		
		try {
			
			
			ObjectSet result = db.queryByExample(new Livre(null,null,isbn,null,null,null,null,null));
			
			Livre tmp=(Livre) result.next();
			db.delete(tmp);
			
			
		} finally {
			db.close();
		}
	}
	
	
public Auteur ajouterauteur(String nom,String prenom,String datenaissance,String lieunaissance,String adresse) {
		Auteur tmp=null;
		
		ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"biblioteque");
		try {
			
			ObjectSet result = db.queryByExample(Auteur.class);
			tmp=new Auteur(result.size()+1,nom,prenom,datenaissance,lieunaissance,adresse);
			ObjectSet existe = db.queryByExample(tmp);
			if(existe==null) {
				db.store(tmp);
			}
			
		} finally {
			db.close();
		}
		
		return tmp;
		
	}

	
	
public LinkedList<Object> listerauteur() {
		
		ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"biblioteque");
		LinkedList<Object> tmp=null;
		try {
			
			
			ObjectSet result = db.queryByExample(Auteur.class);
			tmp=lister(result);
			
			
		} finally {
			db.close();
		}
		
		return tmp;
		
	}
	
	
public Object rechercherauteur(String nom,String prenom) {

		ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"biblioteque");
		LinkedList<Object> r=null;
		try {
			
			Auteur tmp = new Auteur(null,nom,prenom,null,null,null);
			ObjectSet result = db.queryByExample(tmp);
			r=lister(result);
			return r.getFirst();
		}catch (NoSuchElementException e) {
			return null;
		} 
		
		finally {
			db.close();
			
		}
		
		
	}
	
public void supprimerauteur(String nom,String prenom) {

		ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"biblioteque");
		
		try {
			
			
			ObjectSet result = db.queryByExample(new Auteur(null,nom,prenom,null,null,null));
			
			Auteur tmp=(Auteur) result.next();
			db.delete(tmp);
			
			
		} finally {
			db.close();
		}
	}

public Editeur ajouterediteur(String maison,String adresse) {
		Editeur tmp=null;
		
		ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"biblioteque");
		
		try {
			ObjectSet result = db.queryByExample(Editeur.class);
			tmp=new Editeur(result.size()+1,maison,adresse);
			ObjectSet existe = db.queryByExample(tmp);
			if(existe==null) {
				db.store(tmp);
			}
			
			
			
		} finally {
			db.close();
		}
		return tmp;
		
	}
	
	public void supprimerediteur(String maison) {

		ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"biblioteque");
		
		try {
			
			
			ObjectSet result = db.queryByExample(new Editeur(null,maison,null));
			
			Editeur tmp=(Editeur) result.next();
			db.delete(tmp);
			
			
		} finally {
			db.close();
		}
	}
public LinkedList<Object> listerediteur() {
	
	ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"biblioteque");
	LinkedList<Object> tmp=null;
	try {
		
		
		ObjectSet result = db.queryByExample(Editeur.class);
		tmp=lister(result);
		
		
	} finally {
		db.close();
	}
	return tmp;
}	

public Object rechercherediteur(String maison) {

	ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"biblioteque");
	LinkedList<Object> r=null;
	try {
		
		Editeur tmp = new Editeur(null,maison,null);
		ObjectSet result = db.queryByExample(tmp);
		r=lister(result);
		
		return r.getFirst();
	}catch (NoSuchElementException e) {
		return null;
	} 
	
	finally {
		db.close();
		
	}
	

	
}


}

