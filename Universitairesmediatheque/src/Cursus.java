import java.util.ArrayList;
import java.util.List;

public class Cursus {
    private String nom;
    private List<Semestre> semestres;

    public Cursus(String nom) {
        this.nom = nom;
        this.semestres = new ArrayList<>();
    }

    // Getters and setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Semestre> getSemestres() {
        return semestres;
    }

    public void setSemestres(List<Semestre> semestres) {
        this.semestres = semestres;
    }

    // Méthodes
    public void ajouterSemestre(Semestre semestre) {
        semestres.add(semestre);
    }

    public int getNombreHeuresCM() {
        int nombreHeuresCM = 0;
        for(Semestre semestre : semestres) {
            nombreHeuresCM += semestre.calculerNombreHeuresCM();
        }
        return nombreHeuresCM;
    }

    public int getNombreHeuresTD() {
        int nombreHeuresTD = 0;
        for(Semestre semestre : semestres) {
            nombreHeuresTD += semestre.calculerNombreHeuresTD();
        }
        return nombreHeuresTD;
    }

    public int getNombreHeuresTP() {
        int nombreHeuresTP = 0;
        for(Semestre semestre : semestres) {
            nombreHeuresTP += semestre.calculerNombreHeuresTP();
        }
        return nombreHeuresTP;
    }

    public int getNombreHeuresTotales() {
        int nombreHeuresTotales = 0;
        for(Semestre semestre : semestres) {
            nombreHeuresTotales += semestre.calculerNombreHeuresTotales();
        }
        return nombreHeuresTotales;
    }
}
