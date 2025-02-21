package tp;

public class ex2 {
    public static void trouverPaires(int[] tableau, int sommeCible) {
        System.out.println("Paires dont la somme est " + sommeCible + " :");
        
        for (int i = 0; i < tableau.length; i++) {
            for (int j = i + 1; j < tableau.length; j++) {
                if (tableau[i] + tableau[j] == sommeCible) {
                    System.out.println("(" + tableau[i] + ", " + tableau[j] + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] tableau2 = {1, 4, 6, 2, 3, 5, 7};
        int sommeCible = 7;
        trouverPaires(tableau2, sommeCible);
    }
}


