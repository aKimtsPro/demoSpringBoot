package bstrom.akim.demoSpringBoot.exo.parAnnotation.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonneDTO {

    // region attribute ----------------------------------------
    private int id;
    private String nom;
    private LocalDate dateNais;
    // endregion

    // region overrides ----------------------------------------

    @Override
    public String toString() {
        return "Personne : " +
                "\n\t- id : " + getId() +
                "\n\t- nom : " + getNom() +
                "\n\t- date de naissance : " + getDateNais();
    }

    // endregion
}
