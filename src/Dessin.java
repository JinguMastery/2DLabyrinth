import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

class Dessin extends Canvas {
	
	int flèche;
	
	public Dessin(int flèche) {
		this.flèche = flèche;
		this.setForeground(Color.yellow);
	}
	
	public void paint(Graphics G) {
		int[] coordX1 = {85, 85, 135}, coordX2 = {505, 505, 455};
		int[] coordY1 = {flèche, flèche+54, flèche+27}, coordY2 = {flèche, flèche+54, flèche+27};
		G.fillPolygon(coordX1, coordY1, 3);
		G.fillPolygon(coordX2, coordY2, 3);
	}

}
