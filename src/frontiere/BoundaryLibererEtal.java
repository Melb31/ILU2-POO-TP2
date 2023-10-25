package frontiere;

import controleur.ControlLibererEtal;

public class BoundaryLibererEtal {
	private ControlLibererEtal controlLibererEtal;

	public BoundaryLibererEtal(ControlLibererEtal controlLibererEtal) {
		this.controlLibererEtal = controlLibererEtal;
	}

	public void libererEtal(String nomVendeur) {
		if( ! controlLibererEtal.isVendeur(nomVendeur)) {
			System.out.println("Mais vous n'êtes pas inscrit sur notre marché aujourd'hui !");
		}
		else {
			String[] donneesEtal=controlLibererEtal.libererEtal(nomVendeur);
			System.out.println("test");
			if(donneesEtal[0]=="true") {
				StringBuilder string = new StringBuilder("Vous avez vendu ");
				string.append(donneesEtal[4]);
				string.append(" sur ");
				string.append(donneesEtal[3]);
				string.append(" ");
				string.append(donneesEtal[2] +" .\n"+ "En revoir "+ nomVendeur +" ,passez une bonne journée");
				System.out.println(string);
			
			}
		}
	}

}
