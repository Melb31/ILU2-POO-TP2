package frontiere;

import java.util.Scanner;
import frontiere.Clavier;
import controleur.ControlAcheterProduit;

public class BoundaryAcheterProduit {
	private Scanner scan = new Scanner(System.in);
	private ControlAcheterProduit controlAcheterProduit;

	public BoundaryAcheterProduit(ControlAcheterProduit controlAcheterProduit) {
		this.controlAcheterProduit = controlAcheterProduit;
	}

	public void listeDesVendeurs(String produit) {
		//liste le nom des vendeurs qui vendent ce produit genre 1 - Bonemine
	}
	
	
	
	
//	public void choixVendeur(String produit) {
//		
//		for(int i=0; i<vendeurs.length;i++) {
//			System.out.println((i+1)+"- " + vendeurs[i]);
//		}
//		int i=0;
//		boolean choixValide=false;
//		while( ! choixValide) {
//			int choix=Clavier.entrerEntier("Chez quel commerçant voulez-vous acheter des fleurs ?");
//			listeDesVendeurs(produit);
//			choixValide = choix
//		}ici c la ou on doit faire un choix il faut que le choix < nb de vendeurs qui vende le produit
	//ensuite creer dans le controller la liste en String[] des vendeurs et une fois que le choix
	//est fait tu renvoies dans une autre fonction qui traite le choix (ici mais traiter dans controller qui renvoie letal
//	}
//	
	
	
	
	public void acheterProduit(String nomAcheteur) {
		if(!controlAcheterProduit.isAcheteur(nomAcheteur)) {
			System.out.println("Je suis désolée"+ nomAcheteur+ "mais "
					+ "il faut être un habitant de notre village "
					+ "pour commercer ici.");
		}
		else {
			System.out.println("Quel produit voulez-vous acheter ?");
			String produit=scan.nextLine();
//			String listeVendeurs[]=controlAcheterProduit.vendeursProduit(produit);
//			if (listeVendeurs.length==0) {
//				System.out.println("Désolé, personne ne vend ce produit au marché.");
//			}
//			else {
//				//A FINIR
//			}
		}
	}
}
