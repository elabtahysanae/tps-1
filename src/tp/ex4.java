package tp;

public class ex4 {
	    public static void trouverSousTableauMax(int[] tableau) {
	        int maxSomme = Integer.MIN_VALUE, sommeActuelle = 0;
	        int debut = 0, fin = 0, tempDebut = 0;

	        for (int i = 0; i < tableau.length; i++) {
	            sommeActuelle += tableau[i];
	            if (sommeActuelle > maxSomme) {
	                maxSomme = sommeActuelle;
	                debut = tempDebut;
	                fin = i;
	            }
	            if (sommeActuelle < 0) {
	                sommeActuelle = 0;
	                tempDebut = i + 1;
	            }
	        }
	        System.out.println("Somme max: " + maxSomme);
	    }

	    public static void main(String[] args) {
	        int[] tableau = {-2, -1, 4, 1, 2, -1, -3, 4, 1, -5, 2, 1};
	        trouverSousTableauMax(tableau);
	    }
	}



