public class Etudiant extends Personne {
    private String filiere;
    private int niveau;

    public Etudiant(int harpege, String prenom, String nom, String adressePostale, String adresseMail, String filiere, int niveau) {
        super(harpege, prenom, nom, adressePostale, adresseMail);
        this.filiere = filiere;
        this.niveau = niveau;
    }

    // Getter et setter
    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }
}
