package bstrom.akim.demoSpringBoot.exo.parAnnotation.service.mapper;

import bstrom.akim.demoSpringBoot.exo.parAnnotation.data.entity.Personne;
import bstrom.akim.demoSpringBoot.exo.parAnnotation.service.dto.PersonneDTO;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.time.ZoneId;

@Component
public class PersonneMapper implements Mapper<PersonneDTO, Personne> {

    @Override
    public PersonneDTO toDTO(Personne entity) {
        return new PersonneDTO(
                entity.getId(),
                entity.getNom(),
                entity.getDateNaiss()
                        .toInstant()
                        .atZone(ZoneId.of("UTC"))
                        .toLocalDate()
        );
    }

    @Override
    public Personne toEntity(PersonneDTO dto) {
        return new Personne(
                dto.getId(),
                dto.getNom(),
                Date.from(
                        dto.getDateNais()
                        .atStartOfDay()
                        .atZone(ZoneId.of("UTC"))
                        .toInstant()
                ),
                null
        );
    }
}
