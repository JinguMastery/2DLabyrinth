import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class EcouteurBouton implements ActionListener {

	public void actionPerformed(ActionEvent ev) {
		String str = ev.getActionCommand() ;
		if (str == "Jouer")
			Fenetre.setNiveau() ;
		if (str == "Aide")
			
		if (str == "Quitter")
			System.exit(0) ;
	}
	
}
