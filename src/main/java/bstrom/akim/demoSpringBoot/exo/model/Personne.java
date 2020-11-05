package bstrom.akim.demoSpringBoot.exo.model;

import java.time.LocalDate;

public class Personne {

    // region attribute ----------------------------------------
    private String nom;
    private LocalDate dateNais;
    // endregion

    // region constructors -------------------------------------
    public Personne() {}

    public Personne(String nom, LocalDate dateNais) {
        this.nom = nom;
        this.dateNais = dateNais;
    }
    // endregion

    // region get/set ------------------------------------------
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDateNais() {
        return dateNais;
    }

    public void setDateNais(LocalDate dateNais) {
        this.dateNais = dateNais;
    }
    //endregion

    // region overrides ----------------------------------------
    @Override
    public String toString() {
        return "Personne : " +
                "\n  - nom : " + getNom() +
                "\n  - date de naissance : " + getDateNais();
    }

    // endregion
}
