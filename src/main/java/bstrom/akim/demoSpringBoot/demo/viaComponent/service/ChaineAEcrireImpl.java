package bstrom.akim.demoSpringBoot.demo.viaComponent.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("chaine")
public class ChaineAEcrireImpl implements ChaineAEcrire{
    @Override
    public void ajouterTexte(String texte) {
    }

    @Override
    public String getTexte() {
        return null;
    }
}
