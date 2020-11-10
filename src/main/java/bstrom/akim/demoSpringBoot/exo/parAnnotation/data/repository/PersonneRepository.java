package bstrom.akim.demoSpringBoot.exo.parAnnotation.data.repository;


import bstrom.akim.demoSpringBoot.exo.parAnnotation.data.entity.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository<Personne, Integer> {
}