public class Personne {
    private int harpege;
    private String prenom;
    private String nom;
    private String adressePostale;
    private String adresseMail;

    public Personne(int harpege, String prenom, String nom, String adressePostale, String adresseMail) {
        this.harpege = harpege;
        this.prenom = prenom;
        this.nom = nom;
        this.adressePostale = adressePostale;
        this.adresseMail = adresseMail;
    }

    // Getters et setters
    public int getHarpege() {
        return harpege;
    }

    public void setHarpege(int harpege) {
        this.harpege = harpege;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdressePostale() {
        return adressePostale;
    }

    public void setAdressePostale(String adressePostale) {
        this.adressePostale = adressePostale;
    }

    public String getAdresseMail() {
        return adresseMail;
    }

    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
    }
}
