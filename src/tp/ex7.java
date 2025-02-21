package tp;

public class ex7 {
	public class LigneMaxSomme {
	    public static void main(String[] args) {
	        
	        int[][] tableau = {
	            {2, 5},    
	            {2, 3},    
	            {1, 4},    
	            {1, 1, 3}  
	        };

	        int maxSomme = Integer.MIN_VALUE;
	        int ligneMax = -1;

	        
	        for (int i = 0; i < tableau.length; i++) {
	            int somme = 0;
	            for (int j = 0; j < tableau[i].length; j++) {
	                somme += tableau[i][j];
	            }
	            if (somme > maxSomme) {
	                maxSomme = somme;
	                ligneMax = i + 1;  
	            }
	        }

	        System.out.println("La ligne avec la plus grande somme est la ligne " + ligneMax + " avec une somme de " + maxSomme + ".");
	    }
	}


}
