
public class Editeur {

		private Integer idediteur;
		private String maisonedition;
		private String adresse;
		
		public Editeur(Integer idediteur, String maisonedition, String adresse) {
			
			this.idediteur = idediteur;
			this.maisonedition = maisonedition;
			this.adresse = adresse;
		}
		public String toString() {
			return "\n- Maisonedition = " + maisonedition + "\n- Adresse = " + adresse;
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
