import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Création d'un personnel administratif
        Administratif admin = new Administratif(1, "Tsukasa", "Yuzaki", "Tonikaku kawaii", "Tonikaku.kawaii@gmail.com", "Tonikaku", "Directrice");
        
        // Création d'un enseignant
        Enseignant enseignant = new Enseignant(2, "Yotsuba", "Nakano", "Quintuplet", "Quintuplet@gmail.com", "quintuplet", 384, 11);

        // Création d'un enseignant chercheur
        EnseignantChercheur enseignantCh = new EnseignantChercheur(3, "Lum", "Lamu", "Urusei Yatsura", "Urusei.Yatsura@gmail.com", "Urusei", 192, 12,30);
        
        // Création d'un étudiant
        Etudiant etudiant = new Etudiant(4, "Subaru", "Oozora", "hololive", "shuba@gmail.com","Hololive",1);
        
        // Création d'une UV
        UV uv = new UV("PHY001", "physique", 48);
        
        //list UV
        List UV = new ArrayList();
        UV.add(18);
        UV.add(20)
        
        // Création d'une évaluation
        Evaluation evaluation = new Evaluation(uv, enseignantCh, etudiant,"01/03/2023" , 15);
        
        // Création d'un service
        Service service = new Service(UV, enseignant, 64, 2022, 2);
        
        // Création d'un semestre
        Semestre semestre = new Semestre(2);
        semestre.ajouterService(service);
        
        // Création d'un cursus
        Cursus cursus = new Cursus();
        cursus.ajouterSemestre(semestre);
        cursus.ajouterEtudiant(etudiant);
        
        // Affichage des informations
        System.out.println("Personnel administratif : " + admin);
        System.out.println("Enseignant Chercheur : " + enseignantCh);
        System.out.println("Etudiant : " + etudiant);
        System.out.println("Evaluation : " + evaluation);
        System.out.println("UV : " + uv);
        System.out.println("Service : " + service);
        System.out.println("Semestre : " + semestre);
        System.out.println("Cursus : " + cursus);
    }
}
