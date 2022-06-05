import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


class Fenetre extends JFrame {

	public final static Toolkit kit = Toolkit.getDefaultToolkit() ;
	public final static int largeur = kit.getScreenSize().width,
			hauteur = kit.getScreenSize().height ;
	public final static String repertCourant = System.getProperty("user.dir") ;
	private static Container cont ;
	private static JPanel pan ;
	private static JLabel titre ;
	private static Bouton jouer, aide, quitter ;
	private static BoiteDialogue bd ;
	
	public Fenetre() {
		setTitle("2DLabyrinth") ;
		setSize(600, 600) ;
		setLocation(largeur/2-300, hauteur/2-300) ;
		addKeyListener(new EcouteurClavier()) ;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
		setResizable(false) ;
		setCursor(new Cursor(Cursor.HAND_CURSOR)) ;
		setBackground(Color.pink) ;
		titre = new JLabel(new ImageIcon(repertCourant+"/images/titre.png")) ;
		bd = new BoiteDialogue(this) ;
		cont = getContentPane() ;
		cont.setLayout(new BorderLayout()) ;
		cont.add("North", titre) ;
		pan = new JPanel() ;
		pan.setLayout(null) ;
		pan.setBackground(Color.pink) ;
		jouer = new Bouton("Jouer") ;
		aide = new Bouton("Aide") ;
		quitter = new Bouton("Quitter") ;
		jouer.setBounds(145, 75, 300, 75) ;
		aide.setBounds(145, 175, 300, 75) ;
		quitter.setBounds(145, 275, 300, 75) ;
		pan.add(jouer) ;
		pan.add(aide) ;
		pan.add(quitter) ;
		cont.add("Center", pan) ;
	}
	
	public static void setNiveau() {
		cont.setBackground(Color.white) ;
		cont.setForeground(Color.blue) ;
		cont.removeAll() ;
		cont.setLayout(new GridLayout(8, 8)) ;
		Niveau niv = new Niveau() ;
	}
	
}
