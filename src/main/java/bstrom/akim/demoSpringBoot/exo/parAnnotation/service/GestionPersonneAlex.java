package bstrom.akim.demoSpringBoot.exo.parAnnotation.service;

import bstrom.akim.demoSpringBoot.exo.parAnnotation.exception.PersonNotFoundException;
import bstrom.akim.demoSpringBoot.exo.parAnnotation.service.dto.PersonneDTO;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Profile("config2")
public class GestionPersonneAlex implements GestionPersonne {
    ArrayList<PersonneDTO> list = new ArrayList<>();

    @Override
    public void add(PersonneDTO p) {
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
    public List<PersonneDTO> getList() {
        return (List<PersonneDTO>)list.clone();
    }
}
