import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class GestionSouris extends MouseAdapter {

	String texte;
	Niveau Niv;
	
	public GestionSouris(String texte) {
		this.texte = texte;
	}
	
	public void mouseEntered(MouseEvent ME) {
		int fl�che =  0;
		if (texte == "Jouer")
			fl�che = 80;
		if (texte == "Aide")
			fl�che = 180;
		if (texte == "Quitter")
			fl�che = 280;
	}

	public void mouseClicked(MouseEvent ME) {
		if (texte == "Jouer")
			Niv = new Niveau();
		if (texte == "Aide")
			
		if (texte == "Quitter")
			System.exit(0);
	}
	
}
