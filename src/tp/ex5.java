package tp;

public class ex5 {

    public static boolean estPermutation(int[][] matrice) {
        int n = matrice.length;
        boolean[] vus = new boolean[n * n + 1]; 

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int valeur = matrice[i][j];
                
              
                if (valeur < 1 || valeur > n * n || vus[valeur]) {
                    return false; 
                }
                
                vus[valeur] = true; 
            }
        }
        
        return true; 
    }

    public static void main(String[] args) {
        int[][] matrice = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        if (estPermutation(matrice)) {
            System.out.println("C'est une permutation");
        } else {
            System.out.println("Ce n'est pas une permutation");
        }
    }
}
