import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

class Dessin extends Canvas {
	
	int fl�che;
	
	public Dessin(int fl�che) {
		this.fl�che = fl�che;
		this.setForeground(Color.yellow);
	}
	
	public void paint(Graphics G) {
		int[] coordX1 = {85, 85, 135}, coordX2 = {505, 505, 455};
		int[] coordY1 = {fl�che, fl�che+54, fl�che+27}, coordY2 = {fl�che, fl�che+54, fl�che+27};
		G.fillPolygon(coordX1, coordY1, 3);
		G.fillPolygon(coordX2, coordY2, 3);
	}

}
