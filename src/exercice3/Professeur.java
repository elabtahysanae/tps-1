package exercice3;

public class Professeur {
    private int id;
    private String nom;
    private String prenom;
    private String telephone;
    private String email;
    private static int idCounter = 1;

    public Professeur(String nom, String prenom, String telephone, String email) {
        this.id = idCounter++;
        this.nom = nom.toUpperCase();
        this.prenom = capitalize(prenom);
        this.telephone = telephone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return prenom + " " + nom + " - " + email;
    }

    private String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}