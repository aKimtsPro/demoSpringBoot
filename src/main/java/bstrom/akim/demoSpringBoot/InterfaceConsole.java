package bstrom.akim.demoSpringBoot;

import java.util.Scanner;

public class InterfaceConsole {

    private Calculatrice calculatrice;

    public void faireCalcul(){

        System.out.println("On va faire une addition");
        int[] nbr = demanderNombres();

        System.out.println("le résultat de l'addtion est : "
                + calculatrice.addition(nbr[0], nbr[1]));
    }

    public int[] demanderNombres(){
        Scanner sc = new Scanner(System.in);
        int[] nbrs = {0,0};

        System.out.println("entrez nombre 1;");
        nbrs[0] = sc.nextInt();
        System.out.println("entrez nombre 2;");
        nbrs[1] = sc.nextInt();

        return nbrs;
    }

}
