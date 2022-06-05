import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class GestionSouris extends MouseAdapter {

	String texte;
	Niveau Niv;
	
	public GestionSouris(String texte) {
		this.texte = texte;
	}
	
	public void mouseEntered(MouseEvent ME) {
		int flèche =  0;
		if (texte == "Jouer")
			flèche = 80;
		if (texte == "Aide")
			flèche = 180;
		if (texte == "Quitter")
			flèche = 280;
	}

	public void mouseClicked(MouseEvent ME) {
		if (texte == "Jouer")
			Niv = new Niveau();
		if (texte == "Aide")
			
		if (texte == "Quitter")
			System.exit(0);
	}
	
}
