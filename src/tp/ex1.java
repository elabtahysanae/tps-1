package tp;

public class ex1 {

    public static int trouverUnique(int[] tableau) {
        int unique = 0;
        
        for (int i = 0; i < tableau.length; i++) {
            unique = unique ^ tableau[i];  
        }
        
        return unique;
    }

    public static void main(String[] args) {
        int[] tableau1 = {1, 2, 3, 2, 1};
        System.out.println("Le nombre unique est : " + trouverUnique(tableau1));
    }
}
