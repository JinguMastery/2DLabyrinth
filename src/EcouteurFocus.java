import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;


class EcouteurFocus implements FocusListener {

	public void focusGained(FocusEvent ev) {
		JButton bout = (JButton)ev.getSource() ;
		Graphics g = bout.getGraphics() ;
		
	}

	public void focusLost(FocusEvent ev) {
	}

}
