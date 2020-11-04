package bstrom.akim.demoSpringBoot.demo.viaComponent.service;

// @Component
public class ChaineAEcrireMock implements ChaineAEcrire {
    @Override
    public void ajouterTexte(String texte) {
    }

    @Override
    public String getTexte() {
        return "mon texte";
    }
}
