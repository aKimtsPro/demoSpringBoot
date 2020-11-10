package bstrom.akim.demoSpringBoot.exo.parAnnotation.service.mapper;

public interface Mapper<DTO, E> {

    DTO toDTO(E entity);
    E toEntity(DTO dto);
}
