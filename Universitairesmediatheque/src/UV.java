import java.util.ArrayList;

public class UV {
    private String code;
    private String intitule;
    private int volumeHoraire;
    private ArrayList<Service> services;

    public UV(String code, String intitule, int volumeHoraire) {
        this.code = code;
        this.intitule = intitule;
        this.volumeHoraire = volumeHoraire;
        this.services = new ArrayList<Service>();
    }

    // Getters and setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public int getVolumeHoraire() {
        return volumeHoraire;
    }

    public void setVolumeHoraire(int volumeHoraire) {
        this.volumeHoraire = volumeHoraire;
    }

    public ArrayList<Service> getServices() {
        return services;
    }

    public void setServices(ArrayList<Service> services) {
        this.services = services;
    }

    // Méthodes
    public int getHeures() {
        return volumeHoraire;
    }

    public int getHeuresCM() {
        int heuresCM = 0;
        for(Service service : services) {
            heuresCM += service.getHeuresCM();
        }
        return heuresCM;
    }
    
    public int getHeuresTD() {
        int heuresTD = 0;
        for(Service service : services) {
            heuresTD += service.getHeuresTD();
        }
        return heuresTD;
    }
    
    public int getHeuresTP() {
        int heuresTP = 0;
        for(Service service : services) {
            heuresTP += service.getHeuresTP();
        }
        return heuresTP;
    }
    
    public int getHeuresTotales() {
        int heuresTotales = 0;
        for(Service service : services) {
            heuresTotales += service.getHeuresTotales();
        }
        return heuresTotales;
    }
}
