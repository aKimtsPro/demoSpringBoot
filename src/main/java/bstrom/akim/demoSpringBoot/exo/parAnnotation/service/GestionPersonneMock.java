package bstrom.akim.demoSpringBoot.exo.parAnnotation.service;

import bstrom.akim.demoSpringBoot.exo.parAnnotation.exception.PersonNotFoundException;
import bstrom.akim.demoSpringBoot.exo.parAnnotation.service.dto.PersonneDTO;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Profile({"config0"})
public class GestionPersonneMock implements GestionPersonne {

    @Override
    public void add(PersonneDTO p) {
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
    public List<PersonneDTO> getList() {
        return new ArrayList<>(Arrays.asList(
                new PersonneDTO(0,"luc", LocalDate.now()),
                new PersonneDTO(1,"marie", LocalDate.now()),
                new PersonneDTO(2,"dominique", LocalDate.now())
        ));
    }
}
