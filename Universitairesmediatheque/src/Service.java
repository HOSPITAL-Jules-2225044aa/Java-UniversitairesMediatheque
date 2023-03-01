import java.util.List;

public class Service {
    private List<UV> listeUV;
    private Enseignant enseignant;
    private int annee;
    private int semestre;

    public Service(List<UV> listeUV, Enseignant enseignant, int annee, int semestre) {
        this.listeUV = listeUV;
        this.enseignant = enseignant;
        this.annee = annee;
        this.semestre = semestre;
    }

    // Getter et setter
    public List<UV> getListeUV() {
        return listeUV;
    }

    public void setListeUV(List<UV> listeUV) {
        this.listeUV = listeUV;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    // Méthodes
    public int getNombreHeuresCM() {
        int heuresCM = 0;
        for (UV uv : listeUV) {
            heuresCM += uv.getHeuresCM();
        }
        return heuresCM;
    }

    public int getNombreHeuresTD() {
        int heuresTD = 0;
        for (UV uv : listeUV) {
            heuresTD += uv.getHeuresTD();
        }
        return heuresTD;
    }

    public int getNombreHeuresTP() {
        int heuresTP = 0;
        for (UV uv : listeUV) {
            heuresTP += uv.getHeuresTP();
        }
        return heuresTP;
    }

    public int getHarpege() {
        return enseignant.getHarpege();
    }

    public int getNombresHeuresTotales() {
        int heuresTotales = 0;
        for (UV uv : listeUV) {
            heuresTotales += uv.getHeuresTotales();
        }
        return heuresTotales;
    }

    public int getHeuresCM() {
        int heuresCM = 0;
        for (UV uv : listeUV) {
            heuresCM += uv.getHeuresCM();
        }
        return heuresCM;
    }
    
    public int getHeuresTD() {
        int heuresTD = 0;
        for (UV uv : listeUV) {
            heuresTD += uv.getHeuresTD();
        }
        return heuresTD;
    }
    
    public int getHeuresTP() {
        int heuresTP = 0;
        for (UV uv : listeUV) {
            heuresTP += uv.getHeuresTP();
        }
        return heuresTP;
    }
    
    public int getHeuresTotales() {
        return getHeuresCM() + getHeuresTD() + getHeuresTP();
    }
}

