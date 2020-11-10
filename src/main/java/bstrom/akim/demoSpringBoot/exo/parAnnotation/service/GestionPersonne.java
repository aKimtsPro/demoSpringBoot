package bstrom.akim.demoSpringBoot.exo.parAnnotation.service;

import bstrom.akim.demoSpringBoot.exo.parAnnotation.exception.PersonNotFoundException;
import bstrom.akim.demoSpringBoot.exo.parAnnotation.service.dto.PersonneDTO;

import java.util.List;

public interface GestionPersonne {

    // Ajoute une personne à la liste
    void add(PersonneDTO p);

    // supprime une personne à l'index donnée
    // si la personne n'est pas trouvée dans la liste, lance une exception
    void delete(int index) throws PersonNotFoundException;

    // Modifie le nom d'une personne de la liste
    // Si la personne n'est pas dans la liste, lance une exception
    void updateName(int index, String nom) throws PersonNotFoundException;

    // Récupère une copie de la liste
    List<PersonneDTO> getList();
}
