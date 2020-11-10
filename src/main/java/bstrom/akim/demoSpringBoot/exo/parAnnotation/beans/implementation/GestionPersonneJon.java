package bstrom.akim.demoSpringBoot.exo.parAnnotation.beans.implementation;

import bstrom.akim.demoSpringBoot.exo.parAnnotation.beans.interfaces.GestionPersonne;
import bstrom.akim.demoSpringBoot.exo.parAnnotation.exception.PersonNotFoundException;
import bstrom.akim.demoSpringBoot.exo.parAnnotation.model.Personne;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@Profile({"gestion", "prod"})
public class GestionPersonneJon implements GestionPersonne {
    ArrayList<Personne> listPersonne = new ArrayList<Personne>();

    @Override
    public void add(Personne p) {
        listPersonne.add(p);
    }

    @Override
    public void delete(int index) throws PersonNotFoundException {
        if (index<listPersonne.size() && index >=0 ){
            listPersonne.remove(index);
        }
        else throw new PersonNotFoundException(index);
    }

    @Override
    public void updateName(int index, String nom) throws PersonNotFoundException {
        if (index<listPersonne.size() && index >=0){
            listPersonne.get(index).setNom(nom);
        }
        else throw new PersonNotFoundException(index);
    }

    @Override
    public ArrayList<Personne> getList() {
        return (ArrayList<Personne>)listPersonne.clone();
    }
}
