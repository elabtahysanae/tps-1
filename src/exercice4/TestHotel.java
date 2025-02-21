package exercice4;

import exercice4.Hotel;
import exercice4.Salle;

public class TestHotel {
    public static void main(String[] args) {
        
        Salle s1 = new Salle("S1", "Chaplin");
        Salle s2 = new Salle("S2", "Formation");
        Salle s3 = new Salle("S3", "Univers");
        Salle s4 = new Salle("S4", "Pôle");
        Salle s5 = new Salle("S5", "Fête");

        Hotel ibis = new Hotel("IBIS", "21, rue Mohamed V Agadir", "0254676898");
        ibis.ajouterSalle(s3); 
        ibis.ajouterSalle(s4);

        Hotel albatros = new Hotel("ALBATROS GARDEN", "45, rue Mohamed VI Casa", "0254778909");
        albatros.ajouterSalle(s1); 
        albatros.ajouterSalle(s2); 
        albatros.ajouterSalle(s5); 
        System.out.println(ibis);
        System.out.println();
        System.out.println(albatros);
    }
}