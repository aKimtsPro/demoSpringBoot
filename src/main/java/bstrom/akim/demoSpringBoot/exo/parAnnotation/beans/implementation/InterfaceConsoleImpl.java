package bstrom.akim.demoSpringBoot.exo.parAnnotation.beans.implementation;

import bstrom.akim.demoSpringBoot.exo.parAnnotation.beans.interfaces.GestionPersonne;
import bstrom.akim.demoSpringBoot.exo.parAnnotation.beans.interfaces.InterfaceConsoleExo;
import bstrom.akim.demoSpringBoot.exo.parAnnotation.exception.PersonNotFoundException;
import bstrom.akim.demoSpringBoot.exo.parAnnotation.model.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

@Component
public class InterfaceConsoleImpl implements InterfaceConsoleExo {

    @Autowired
    private GestionPersonne gestionPersonne;
    @Autowired
    private Scanner scan;

    // region fonctionnalités

    private void afficherMenu(){
        System.out.println("MENU:\n" +
                "1 - ajouter une personne\n" +
                "2 - supprimer une personne\n" +
                "3 - modifier le nom d'une personne\n" +
                "4 - afficher les personne\n" +
                "5 - quitter");
    }
    private int demandeChoix(){
        System.out.println("Veuillez choisir une action : ");
        return scan.nextInt();
    }
    private void mapChoix(int choix){
        switch (choix){
            case 1: // ajout
                ajouter();
                break;
            case 2: // suppression
                supprimer();
                break;
            case 3: // modif de nom
                modifier();
                break;
            case 4: // affichage des personnes
                afficherPersonnes();
                break;
            case 5: // quitter
                quitter();
                break;
            default:
                System.out.println("Le choix est invalide");
        }
    }

    // region actions

    private void ajouter(){

        Personne p = new Personne();

        System.out.println("Veuillez entrez les infos concernant la personne à insérer:");
        System.out.print("- nom :");
        p.setNom( scan.next() );

        System.out.print("- date de naissance :");
        try{
            p.setDateNais( LocalDate.parse(scan.next()) );
        }
        catch (DateTimeParseException dateTimeParseException)
        {
            System.out.println("date invalide. EPOCH mis en date de naissance");
            p.setDateNais( LocalDate.EPOCH ); // 1970-01-01
        }

        gestionPersonne.add(p);

    }
    private void supprimer(){
        System.out.print("Index de la personne à supprimer : ");

        try{
            gestionPersonne.delete( scan.nextInt() );
        }
        catch (PersonNotFoundException e){
            System.out.println("index invalide : " + e.getMessage());
        }
    }
    private void modifier(){

        System.out.println("Index de la personne à modifier");
        int index = scan.nextInt();

        System.out.println("Nouveau nom :");
        String nouveauNom = scan.next();

        try{
            gestionPersonne.updateName(index, nouveauNom);
        }
        catch (PersonNotFoundException e){
            System.out.println("index invalide : " + e.getMessage());
        }

    }
    private void afficherPersonnes(){

        List<Personne> list = gestionPersonne.getList();

        if(list.isEmpty())
            System.out.println("La liste est vide");
        else
            for (int i = 0; i < list.size(); i++)
                System.out.println(i + " - " + list.get(i));

    }
    private void quitter(){
        System.out.println("A la prochaine");
    }

    // endregion

    // endregion

    @Override
    public void start() {

        int choix = 0;
        do{
            afficherMenu();
            choix = demandeChoix();
            mapChoix(choix);
        }while(choix != 5);

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        start();
    }
}
