import java.awt.Toolkit;

class Menu {

	Fenêtre F = new Fenêtre();
	static String dossier = System.getProperty("user.dir");
	static Toolkit kit = Toolkit.getDefaultToolkit();
	static int largeur = (int)kit.getScreenSize().getWidth();
	static int hauteur = (int)kit.getScreenSize().getHeight();

	public Menu() {
		Niveau.setMenu(this);
	}
	
	public static void main(String[] args) {
		Menu M = new Menu();
	}
	
}
