package bstrom.akim.demoSpringBoot.exo.exception;

public class PersonNotFoundException extends Exception {

    private int indexRecherche;

    public PersonNotFoundException(int index) {
        super("L'index {" +index+"} n'existe pas dans la liste de personne" );
        indexRecherche = index;
    }
}
