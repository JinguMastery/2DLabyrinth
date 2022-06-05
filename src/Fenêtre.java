import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Fenêtre extends JFrame {

	JPanel P1 = new JPanel();
	JPanel P2 = new JPanel();
	JLabel titre = new JLabel(new ImageIcon(Menu.dossier+"/images/titre.png"));
	Bouton jouer = new Bouton("Jouer");
	Bouton aide = new Bouton("Aide");
	Bouton quitter = new Bouton("Quitter");
	
	public Fenêtre() {
		P1.setBackground(Color.pink);
		P1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		P1.setLayout(new BorderLayout());
		P1.add("North", titre);
		P2.setLayout(null);
		P2.setBackground(Color.pink);
		jouer.setBounds(145, 75, 300, 75);
		aide.setBounds(145, 175, 300, 75);
		quitter.setBounds(145, 275, 300, 75);
		P2.add(jouer);
		P2.add(aide);
		P2.add(quitter);
		P1.add("Center", P2);
		this.setTitle("2DLabyrinth");
		this.addKeyListener(new GestionClavier());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(600, 600);
		this.setLocation(Menu.largeur/2-300, Menu.hauteur/2-300);
	}
	
	public void afficher() {
		this.setContentPane(this.getContentPane());
		this.setVisible(true);
	}

	public Container panneauFenêtre() {
		Container panneau = this.getContentPane();
		return panneau;
	}

	
}
