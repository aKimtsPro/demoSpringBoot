package bstrom.akim.demoSpringBoot.exo.parAnnotation.service;

import bstrom.akim.demoSpringBoot.exo.parAnnotation.data.entity.Personne;
import bstrom.akim.demoSpringBoot.exo.parAnnotation.data.repository.PersonneRepository;
import bstrom.akim.demoSpringBoot.exo.parAnnotation.exception.PersonNotFoundException;
import bstrom.akim.demoSpringBoot.exo.parAnnotation.service.dto.PersonneDTO;
import bstrom.akim.demoSpringBoot.exo.parAnnotation.service.mapper.Mapper;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Profile("config3")
public class PersonneServiceImpl implements PersonneService {

    private PersonneRepository repo;
    private Mapper<PersonneDTO, Personne> mapper;

    public PersonneServiceImpl(PersonneRepository repo, Mapper<PersonneDTO, Personne> mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    public void add(PersonneDTO p) {
        repo.save( mapper.toEntity(p) );
    }

    @Override
    public void delete(int index) throws PersonNotFoundException {
        if(!repo.existsById(index))
            throw new PersonNotFoundException(index);

        repo.deleteById( index );
    }

    @Override
    public void updateName(int index, String nom) throws PersonNotFoundException {

        Personne p = repo.findById(index)
                .orElseThrow(() -> new PersonNotFoundException(index));
        p.setNom(nom);
        repo.save(p);
    }

    @Override
    public List<PersonneDTO> getList() {

        return repo.findAll()
                .stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());

    }
}
