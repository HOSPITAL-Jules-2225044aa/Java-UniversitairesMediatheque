import java.util.ArrayList;

public class Semestre {
    private int numero;
    private ArrayList<Service> listeServices;

    public Semestre(int numero) {
        this.numero = numero;
        this.listeServices = new ArrayList<Service>();
    }

    // Getter et setter
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Service> getListeServices() {
        return listeServices;
    }

    public void setListeServices(ArrayList<Service> listeServices) {
        this.listeServices = listeServices;
    }

    // Méthodes
    public void ajouterService(Service service) {
        this.listeServices.add(service);
    }

    public int calculerNombreHeuresCM() {
        int nbHeuresCM = 0;
        for (Service service : listeServices) {
            nbHeuresCM += service.getNombreHeuresCM();
        }
        return nbHeuresCM;
    }

    public int calculerNombreHeuresTD() {
        int nbHeuresTD = 0;
        for (Service service : listeServices) {
            nbHeuresTD += service.getNombreHeuresTD();
        }
        return nbHeuresTD;
    }

    public int calculerNombreHeuresTP() {
        int nbHeuresTP = 0;
        for (Service service : listeServices) {
            nbHeuresTP += service.getNombreHeuresTP();
        }
        return nbHeuresTP;
    }

    public int calculerNombreHeuresCM(int numEnseignant) {
        int nbHeuresCM = 0;
        for (Service service : listeServices) {
            if (service.getEnseignant().getHarpege() == numEnseignant) {
                nbHeuresCM += service.getNombreHeuresCM();
            }
        }
        return nbHeuresCM;
    }

    public int calculerNombreHeuresTD(int numEnseignant) {
        int nbHeuresTD = 0;
        for (Service service : listeServices) {
            if (service.getEnseignant().getHarpege() == numEnseignant) {
                nbHeuresTD += service.getNombreHeuresTD();
            }
        }
        return nbHeuresTD;
    }

    public int calculerNombreHeuresTP(int numEnseignant) {
        int nbHeuresTP = 0;
        for (Service service : listeServices) {
            if (service.getEnseignant().getHarpege() == numEnseignant) {
                nbHeuresTP += service.getNombreHeuresTP();
            }
        }
        return nbHeuresTP;
    }

    public int calculerNombreHeuresTotales() {
        int nbHeuresTotales = 0;
        for (Service service : listeServices) {
            nbHeuresTotales += service.getNombresHeuresTotales();
        }
        return nbHeuresTotales;
    }

    public int calculerNombreHeuresTotales(int numEnseignant) {
        int nbHeuresTotales = 0;
        for (Service service : listeServices) {
            if (service.getEnseignant().getHarpege() == numEnseignant) {
                nbHeuresTotales += service.getNombresHeuresTotales();
            }
        }
        return nbHeuresTotales;
    }
}
