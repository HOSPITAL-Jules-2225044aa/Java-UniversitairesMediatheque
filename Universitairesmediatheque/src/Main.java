import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Instanciation d'un cursus avec un nom et une liste d'étudiants
        List<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(new Etudiant("123456", "Dupont", "Jean"));
        etudiants.add(new Etudiant("789012", "Martin", "Sophie"));
        Cursus cursus = new Cursus("Licence Informatique", etudiants);
        
        // Affichage du nom du cursus
        System.out.println("Nom du cursus : " + cursus.getNom());
        
        // Ajout d'une UV au cursus
        UV uv = new UV("INFO101", "Introduction à l'informatique", 30);
        cursus.ajouterUV(uv);
        
        // Affichage du volume horaire de l'UV ajoutée
        System.out.println("Volume horaire de l'UV ajoutée : " + uv.getVolumeHoraire());
    }
}
