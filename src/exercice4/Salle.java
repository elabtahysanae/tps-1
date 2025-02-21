package exercice4;

public class Salle {
    private int id;
    private String code;
    private String libelle;
    private static int idCounter = 1;

    public Salle(String code, String libelle) {
        this.id = idCounter++;
        this.code = code;
        this.libelle = libelle;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getLibelle() {
        return libelle;
    }

    @Override
    public String toString() {
        return libelle + " (" + code + ")";
    }
}