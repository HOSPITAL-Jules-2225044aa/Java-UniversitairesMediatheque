public class Administratif extends Personnel {
    private String fonction;

    public Administratif(int harpege, String prenom, String nom, String adressePostale, String adresseMail, String etablissement, String fonction) {
        super(harpege, prenom, nom, adressePostale, adresseMail, etablissement);
        this.fonction = fonction;
    }

    // Getter et setter
    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }
}