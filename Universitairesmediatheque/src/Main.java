public class Main {
    public static void main(String[] args) {
        // Création d'un personnel administratif
        Administratif admin = new Administratif(1, "Tsukasa", "Yuzaki", "Tonikaku kawaii", "Tonikaku.kawaii@gmail.com", "Tonikaku", "Directrice");

        // Création d'un enseignant
        Enseignant enseignant = new Enseignant(2, "Lum", "Lamu", "Urusei Yatsura", "Urusei.Yatsura@gmail.com", "Urusei", 12, 192);

        // Création d'un étudiant
        Etudiant etudiant = new Etudiant(3, "Subaru", "Oozora", "hololive", "shuba@gmail.com","Hololive",1);

        // Création d'une évaluation
        Evaluation evaluation = new Evaluation("Physique", "Examen final", "Subaru Oozora","01/03/2023" , 15;

        // Création d'une UV
        UV uv = new UV("PHY001", "Mécanique", 48);

        // Création d'un service
        Service service = new Service(enseignant, uv, 64, 64, 64);

        // Création d'un semestre
        Semestre semestre = new Semestre();
        semestre.ajouterService(service);

        // Création d'un cursus
        Cursus cursus = new Cursus();
        cursus.ajouterSemestre(semestre);
        cursus.ajouterEtudiant(etudiant);

        // Affichage des informations
        System.out.println("Personnel administratif : " + admin);
        System.out.println("Enseignant : " + enseignant);
        System.out.println("Etudiant : " + etudiant);
        System.out.println("Evaluation : " + evaluation);
        System.out.println("UV : " + uv);
        System.out.println("Service : " + service);
        System.out.println("Semestre : " + semestre);
        System.out.println("Cursus : " + cursus);
    }
}
