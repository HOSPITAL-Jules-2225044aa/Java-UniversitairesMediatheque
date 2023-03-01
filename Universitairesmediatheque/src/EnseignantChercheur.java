public class EnseignantChercheur extends Enseignant {
    private int heuresRecherche;

    public EnseignantChercheur(int harpege, String prenom, String nom, String adressePostale, String adresseMail, String etablissement, int serviceStatutaire, int décharge, int heuresRecherche) {
        super(harpege, prenom, nom, adressePostale, adresseMail, etablissement, serviceStatutaire, décharge);
        this.heuresRecherche = heuresRecherche;
    }

    // Getter et setter
    public int getHeuresRecherche() {
        return heuresRecherche;
    }

    public void setHeuresRecherche(int heuresRecherche) {
        this.heuresRecherche = heuresRecherche;
    }

    // Méthode
    public int calculerServiceEffectif(int heuresRecherche) {
        int serviceEffectif = super.calculerServiceEffectif(heuresRecherche) - heuresRecherche;
        return serviceEffectif;
    }
}
