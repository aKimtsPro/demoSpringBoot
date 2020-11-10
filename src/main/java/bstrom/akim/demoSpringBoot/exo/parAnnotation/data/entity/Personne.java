package bstrom.akim.demoSpringBoot.exo.parAnnotation.data.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Personne {

    @Id
    @Column(name = "personne_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "personne_name", nullable = false)
    private String nom;

    @Column(name = "personne_bdate", nullable = false)
    private Date dateNaiss;

    @Column(name = "personne_adresse")
    private String adresse;
}
