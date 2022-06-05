import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class GestionClavier implements KeyListener {

	public GestionClavier() {
		
	}

	public void keyTyped(KeyEvent KE) {
		if (KE.getKeyCode() == KeyEvent.VK_UP)
			System.out.print("up");
	}

	public void keyPressed(KeyEvent KE) {
		
	}

	public void keyReleased(KeyEvent KE) {
		
	}
	
}
