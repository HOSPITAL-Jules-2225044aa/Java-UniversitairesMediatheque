public class Enseignant extends Personnel {
    private int serviceStatutaire;
    private int décharge;

    public Enseignant(int harpege, String prenom, String nom, String adressePostale, String adresseMail, String etablissement, int serviceStatutaire, int décharge) {
        super(harpege, prenom, nom, adressePostale, adresseMail, etablissement);
        this.serviceStatutaire = serviceStatutaire;
        this.décharge = décharge;
    }

    public void EnseignantChercheur(int harpege, String prenom, String nom, String adressePostale, String adresseMail,
            String etablissement, int serviceStatutaire2, int décharge) {
    }

    // Getter et setter
    public int getServiceStatutaire() {
        return serviceStatutaire;
    }

    public void setServiceStatutaire(int serviceStatutaire) {
        this.serviceStatutaire = serviceStatutaire;
    }

    public int getDécharge() {
        return décharge;
    }

    public void setDécharge(int décharge) {
        this.décharge = décharge;
    }

    // Méthodes
    public int calculerServiceEffectif(int décharge) {
        int serviceEffectif = serviceStatutaire - décharge;
        return serviceEffectif;
    }
}
