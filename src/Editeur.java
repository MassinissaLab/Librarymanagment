import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class Editeur {

		private Integer idediteur;
		private String maisonedition;
		private String adresse;
		
		public Editeur(String maisonedition, String adresse) {
			
			
			this.maisonedition = maisonedition;
			this.adresse = adresse;
			ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"biblioteque");
			try {
				
				ObjectSet result = db.queryByExample(Editeur.class);
				idediteur=result.size()+1;
				
				
				
			} finally {
				db.close();
			}
		}
		
	public Editeur(Integer idediteur,String maisonedition, String adresse) {
			
			this.idediteur=idediteur;
			this.maisonedition = maisonedition;
			this.adresse = adresse;
			
		}
		public String toString() {
			return "\n- Maison d'édition = " + maisonedition + "\n- Adresse = " + adresse;
		}
		public Integer getIdediteur() {
			return idediteur;
		}
		public void setIdediteur(Integer idediteur) {
			this.idediteur = idediteur;
		}
		public String getMaisonedition() {
			return maisonedition;
		}
		public void setMaisonedition(String maisonedition) {
			this.maisonedition = maisonedition;
		}
		public String getAdresse() {
			return adresse;
		}
		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}
}
