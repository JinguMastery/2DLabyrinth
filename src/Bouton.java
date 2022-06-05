import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;


class Bouton extends JButton {

	private Font fond ;
	private EcouteurBouton ecoutBout ;
	private EcouteurFocus ecoutFocus ;
	
	public Bouton(String lab) {
		super(lab) ;
		fond = new Font("Consolas", Font.BOLD, 24) ;
		setFont(fond) ;
		setForeground(Color.blue) ;
		setBackground(Color.lightGray) ;
		ecoutBout = new EcouteurBouton() ;
		addActionListener(ecoutBout) ;
		ecoutFocus = new EcouteurFocus() ;
		addFocusListener(ecoutFocus) ;
	}

}

