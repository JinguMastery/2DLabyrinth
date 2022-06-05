import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.*;
import java.io.File;
import java.io.IOException;


class DessinerImage extends JPanel {

	private Image image;
	private int indexTableau;

	public DessinerImage(String str) {
		String type = null ;
		if (str.charAt(1) == 'B')
			type = "blocs/";
		if (str.charAt(1) == 'E')
			type = "éléments/";
		if (str.charAt(1) == 'O')
			type = "objets/";
		try {
			image = ImageIO.read(new File(Main.dossier+"/images/"+type+nomImage.substring(3)));
		}
		catch(IOException exc) {
			exc.printStackTrace();
		}
	}


	public void paintComponent(Graphics g) {
		g.drawImage(image, 0, 0, this);
		g.setColor(Color.blue);
		if ( getIndexTableau() == 30)
			g.fillOval(75*(Niveau.coordX-1)+13, 75*(Niveau.coordY-1)+14, 45, 45);
	}

	public void setIndexTableau(int indexTableau) {
		this.indexTableau = indexTableau;
	}	
	
	private int getIndexTableau() {
		return indexTableau;
	}
	

}
