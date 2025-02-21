package exercice3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestProfesseur {
    public static void main(String[] args) {
        Specialite javaJEE = new Specialite("JAVA", "JAVA/JEE");
        Specialite dotNet = new Specialite(".NET", ".NET");
        Specialite gestionProjet = new Specialite("GP", "Gestion de projet");
        Specialite cisco = new Specialite("CISCO", "CISCO");
        Specialite php = new Specialite("PHP", "PHP");

        List<Professeur> professeurs = new ArrayList<>();
        professeurs.add(new Professeur("SAFI", "Amal", "0123456789", "safi@gmail.com"));
        professeurs.add(new Professeur("ALAMI", "Said", "0123456789", "alami@yahoo.fr"));
        professeurs.add(new Professeur("ALAOUI", "Reda", "0123456789", "alaoui@yahoo.fr"));
        professeurs.add(new Professeur("KAMALI", "Imane", "0123456789", "i.kamali@gmail.com"));

        Map<Specialite, List<Professeur>> specialiteProfesseurs = new HashMap<>();
        specialiteProfesseurs.put(javaJEE, professeurs.subList(0, 2));
        specialiteProfesseurs.put(cisco, professeurs.subList(2, 4));

        for (Map.Entry<Specialite, List<Professeur>> entry : specialiteProfesseurs.entrySet()) {
            Specialite specialite = entry.getKey();
            List<Professeur> profList = entry.getValue();

            System.out.print("Spécialité " + specialite.getLibelle() + " - ");
            for (Professeur prof : profList) {
                System.out.print(prof + " - ");
            }
            System.out.println();
        }
    }
}