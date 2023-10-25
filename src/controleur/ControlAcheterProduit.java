package controleur;

import villagegaulois.Village;

import com.sun.xml.internal.bind.v2.TODO;

import personnages.Gaulois;
public class ControlAcheterProduit {
	private Village village;
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;
	private ControlVerifierIdentite controlVerifierIdentite;

	public ControlAcheterProduit(ControlVerifierIdentite controlVerifierIdentite,
			ControlTrouverEtalVendeur controlTrouverEtalVendeur,
			Village village) {
		this.village = village;
		this.controlVerifierIdentite = controlVerifierIdentite;
		this.controlTrouverEtalVendeur = controlTrouverEtalVendeur;
	}

	public boolean isAcheteur(String nomAcheteur) {
		return controlVerifierIdentite.verifierIdentite(nomAcheteur);
	}
	
//	public String[] vendeursProduit(String produit) {
//		transfomer les gaulois en string avec nom du vendeur 
//		return village.rechercherVendeursProduit(produit);
//	}
//	

}
