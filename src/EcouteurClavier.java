import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


class EcouteurClavier implements KeyListener {

	public void keyTyped(KeyEvent ev) {
		if (ev.getKeyCode() == KeyEvent.VK_UP)
			System.out.print("up") ;
	}

	public void keyPressed(KeyEvent ev) {
	}

	public void keyReleased(KeyEvent ev) {
	}
	
}
