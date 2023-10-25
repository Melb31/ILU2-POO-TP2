package frontiere;

import controleur.ControlAfficherMarche;

public class BoundaryAfficherMarche {
	private ControlAfficherMarche controlAfficherMarche;

	public BoundaryAfficherMarche(ControlAfficherMarche controlAfficherMarche) {
		this.controlAfficherMarche = controlAfficherMarche;
	}

	public void afficherMarche(String nomAcheteur) {
			String[] infosMarche=controlAfficherMarche.donnerInfosMarche();
			if(infosMarche.length==0) {
				System.out.println("Le marché est vide, revenez plus tard");
			}
			else {
				StringBuilder string =new StringBuilder();
				System.out.println(nomAcheteur+" vous trouverez au marché: ");
				for(int i=0; i<infosMarche.length;i++ ) {
					string.append("- "+infosMarche[i]);
					i++;
					string.append("qui vend "+infosMarche[i]);
					i++;
					string.append("  "+infosMarche[i]+"\n");
				}
				System.out.println(string);
			}
	}
}
