import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;


class BoiteDialogue extends JDialog {
	
	private Container cont ;
	private JList <String> listeNiv ;
	private JButton commencer ;
	
	
	public BoiteDialogue(JFrame fen) {
		super(fen, "Choix du niveau", true) ;
		setSize(200, 200) ;
		listeNiv = new JList <String> (Niveau.nomsNiv) ;
		listeNiv.setSelectionMode(ListSelectionModel.SINGLE_SELECTION) ;
		listeNiv.setSelectedIndex(0) ;
		listeNiv.setVisibleRowCount(6) ;
		commencer = new JButton("C'est parti !") ;
		cont = getContentPane() ;
		cont.setLayout(new BorderLayout()) ;
		cont.add(new JScrollPane(listeNiv), "West") ;
		cont.add(commencer, "South") ;
	}

}
