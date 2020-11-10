package bstrom.akim.demoSpringBoot.exo.parAnnotation.service;

import bstrom.akim.demoSpringBoot.exo.parAnnotation.service.GestionPersonne;
import bstrom.akim.demoSpringBoot.exo.parAnnotation.exception.PersonNotFoundException;
import bstrom.akim.demoSpringBoot.exo.parAnnotation.model.Personne;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("config2")
public class GestionPersonneAlex implements GestionPersonne {
    ArrayList<Personne> list = new ArrayList<>();

    @Override
    public void add(Personne p) {
        list.add(p);
    }

    @Override
    public void delete(int index) throws PersonNotFoundException {
        if(index > this.list.size() || index < 0)
            throw new PersonNotFoundException(index);

        list.remove(index);
    }

    @Override
    public void updateName(int index, String nom) throws PersonNotFoundException {
        if(index > this.list.size() || index < 0)
            throw new PersonNotFoundException(index);

        list.get(index).setNom(nom);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Personne> getList() {
        return (List<Personne>)list.clone();
    }
}
