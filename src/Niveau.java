
class Niveau {
	
	public final static String[] nomsNiv ;

	public Niveau() {
		String nomImage = null ;
		for (int i = 1 ; i <= 64 ; i++) {
			switch(i) {
			case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 16: case 17:
			case 19: case 20: case 21: case 22: case 23: case 24: case 25: case 27: case 28: case 29:
			case 31: case 32: case 33: case 35: case 40: case 41: case 43: case 44: case 45: case 48:
			case 49: case 55: case 56: case 57: case 58: case 59: case 60: case 61: case 62: case 63:
			case 64:
				nomImage = "(B)brique.png" ;
				break ;
			case 10: case 11: case 12: case 13: case 14: case 18: case 26: case 30: case 37: case 39:
			case 42: case 46: case 47: case 50: case 51: case 52: case 53: case 54:
				nomImage = "(B)sol.png" ;
				break ;
			case 15:
				nomImage = "(E)etoile_fin_de_niveau.png" ;
				break ;
			case 34:
				nomImage = "(B)porte_argent.png" ;
				break;
			case 36:
				nomImage = "(O)cle_argent.png" ;
				break;
			case 38:
				nomImage = "(E)etoile_cardinale.png" ;
			}
			
			DessinerImage dessinerImage = new DessinerImage(nomImage);
			dessinerImage.setIndexTableau(i);
		}
	}
	
}
