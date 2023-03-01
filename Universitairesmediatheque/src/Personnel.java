import java.util.ArrayList;

public class Personnel extends Personne {
    private String etablissement;
    private ArrayList<String> adressesMail;

    public Personnel(int harpege, String prenom, String nom, String adressePostale, String adresseMail, String etablissement) {
        super(harpege, prenom, nom, adressePostale, adresseMail);
        this.etablissement = etablissement;
        this.adressesMail = new ArrayList<String>();
    }

    // Getters et setters
    public String getEtablissement() {
        return etablissement;
    }

    public void setEtablissement(String etablissement) {
        this.etablissement = etablissement;
    }

    public ArrayList<String> getAdressesMail() {
        return adressesMail;
    }

    public void addAdresseMail(String adresseMail) {
        this.adressesMail.add(adresseMail);
    }

    public void removeAdresseMail(String adresseMail) {
        this.adressesMail.remove(adresseMail);
    }

    public void clearAdressesMail() {
        this.adressesMail.clear();
    }
}
