package bstrom.akim.demoSpringBoot.demo.viaComponent.presentation;

import bstrom.akim.demoSpringBoot.demo.viaComponent.service.ChaineAEcrire;
import org.springframework.stereotype.Component;

import java.util.Scanner;

//@Component
public class InterfaceEcritureImpl implements InterfaceEcriture {

    private ChaineAEcrire cae;
    private Scanner scan;

    public InterfaceEcritureImpl(ChaineAEcrire cae, Scanner scan) {
        this.cae = cae;
        this.scan = scan;
    }

    private void afficherMenu() {
        System.out.println("Choisissez quoi faire:" +
                "\n\t1-ajouter du texte" +
                "\n\t2-afficher le texte" +
                "\n\t3-quitter");
    }

    private int getChoix() {
        System.out.println("Veuillez entrer votre choix :");
        return scan.nextInt();
    }

    private void recupText() {
        System.out.println("Veuillez entrer le texte à ajouter:");
        cae.ajouterTexte( scan.nextLine() );
    }

    private void afficheText() {
        System.out.println( cae.getTexte() );
    }

    @Override
    public void start() {
        int choix = 0;
        do{
            this.afficherMenu();
            choix = getChoix();

            switch (choix){
                case 1:
                    recupText();
                    break;
                case 2:
                    afficheText();
                    break;
                case 3:
                    System.out.println("merci pour l'utilisation, au revoir");
                    break;
                default:
                    System.out.println("veuillez indiquer une valeur valide");
            }

        }while(choix != 3);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        start();
    }
}
