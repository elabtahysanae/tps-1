package exercice4;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private int id;
    private String nom;
    private String adresse;
    private String telephone;
    private List<Salle> salles;
    private static int idCounter = 1;

    public Hotel(String nom, String adresse, String telephone) {
        this.id = idCounter++;
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.salles = new ArrayList<>();
    }

    public void ajouterSalle(Salle salle) {
        salles.add(salle);
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public List<Salle> getSalles() {
        return salles;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("L’hôtel ").append(nom).append(" contient ").append(salles.size()).append(" salles de réunions :\n");
        for (int i = 0; i < salles.size(); i++) {
            sb.append("  Salle ").append(i + 1).append(" : ").append(salles.get(i)).append("\n");
        }
        sb.append("Ses coordonnées sont les suivantes :\n");
        sb.append("  Tél : ").append(telephone).append("\n");
        sb.append("  Adresse : ").append(adresse).append("\n");
        return sb.toString();
    }
}