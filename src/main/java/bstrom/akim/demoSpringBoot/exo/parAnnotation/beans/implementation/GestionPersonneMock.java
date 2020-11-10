package bstrom.akim.demoSpringBoot.exo.parAnnotation.beans.implementation;

import bstrom.akim.demoSpringBoot.exo.parAnnotation.beans.interfaces.GestionPersonne;
import bstrom.akim.demoSpringBoot.exo.parAnnotation.exception.PersonNotFoundException;
import bstrom.akim.demoSpringBoot.exo.parAnnotation.model.Personne;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Profile({"dev", "config1"})
public class GestionPersonneMock implements GestionPersonne {

    @Override
    public void add(Personne p) {
    }

    @Override
    public void delete(int index) throws PersonNotFoundException {
        if(index >= 5)
            throw  new PersonNotFoundException(index);
    }

    @Override
    public void updateName(int index, String nom) throws PersonNotFoundException {
        if(index >= 5)
            throw  new PersonNotFoundException(index);
    }

    @Override
    public List<Personne> getList() {
        return new ArrayList<>(Arrays.asList(
                new Personne("luc", LocalDate.now()),
                new Personne("marie", LocalDate.now()),
                new Personne("dominique", LocalDate.now())
        ));
    }
}
