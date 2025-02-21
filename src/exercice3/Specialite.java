package exercice3;

public class Specialite {
    private int id;
    private String code;
    private String libelle;
    private static int idCounter = 1;

    public Specialite(String code, String libelle) {
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
        return "Specialite{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", libelle='" + libelle + '\'' +
                '}';
    }
}