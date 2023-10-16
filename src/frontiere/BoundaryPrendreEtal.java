package frontiere;

import java.util.Scanner;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;
	private Scanner scan = new Scanner(System.in);

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {

		if(!controlPrendreEtal.verifierIdentite(nomVendeur)) {
			StringBuilder string= new StringBuilder("Je suis desolée ");
			string.append(nomVendeur);
			string.append("mais il faut être un habitant de notre village pour commercer ici\n");
			System.out.println(string.toString());}
		else {
			installerVendeur(nomVendeur);
			}
		}
	

	private void installerVendeur(String nomVendeur) {
		
		System.out.println("C'est parfait, il me reste un étal pour vous !\nIl me faudrait quelques renseignements :");
		System.out.println("Quel produit souhaitez-vous vendre ?");
		String produit=scan.nextLine();
		int nbProduit=Clavier.entrerEntier("Combien souhaitez-vous en vendre ?");
		int numeroEtal=controlPrendreEtal.prendreEtal(nomVendeur, produit, nbProduit);
		if (numeroEtal!=-1) {
			StringBuilder string= new StringBuilder("Le vendeur");
			string.append(nomVendeur);
			string.append("s'est installé à l'étal n°");
			string.append(numeroEtal);
			System.out.println(string);
		}
		
		
	}
}
