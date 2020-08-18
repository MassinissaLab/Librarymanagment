import java.util.LinkedList;
import java.util.ListIterator;

public class test {

	public static void main(String[] args) {
		Biblioteque b=new Biblioteque();
		
		//Auteur aut=b.ajouterauteur("Paulo" , "Coelho", "24/08/1947", "Rio de Janeiro", "Rio de Janeiro,Brésil");
		
		
		
		//b.listerauteur();
		//Editeur edit=b.ajouterediteur("Planeta", "Brésil");
		
		//b.listerediteur();
		
		//boolean t=b.ajouterlivre("L'Alchimiste ", "978-2-910188-13-9", aut, edit, "1988", "Conte philosophique", "les Signes-l'Ame du Monde-la Legende personnelle ");
		

		System.out.println(b.rechercherauteur("Paul" , "Coelho"));

}
}