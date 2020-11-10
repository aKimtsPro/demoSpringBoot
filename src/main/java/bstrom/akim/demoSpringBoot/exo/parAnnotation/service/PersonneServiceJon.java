package bstrom.akim.demoSpringBoot.exo.parAnnotation.service;

import bstrom.akim.demoSpringBoot.exo.parAnnotation.exception.PersonNotFoundException;
import bstrom.akim.demoSpringBoot.exo.parAnnotation.service.dto.PersonneDTO;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@Profile({"config1"})
public class PersonneServiceJon implements PersonneService {
    ArrayList<PersonneDTO> listPersonne = new ArrayList<PersonneDTO>();

    @Override
    public void add(PersonneDTO p) {
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
    public ArrayList<PersonneDTO> getList() {
        return (ArrayList<PersonneDTO>)listPersonne.clone();
    }
}
