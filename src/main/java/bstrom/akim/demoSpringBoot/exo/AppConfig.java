package bstrom.akim.demoSpringBoot.exo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
public class AppConfig {

    @Bean
    public GestionPersonne gestionPersonne(){
        return new GestionPersonneAlex();
    }

    @Bean
    public InterfaceConsoleExo interfaceConsole(){
        return new InterfaceConsoleImpl( gestionPersonne(), lecteur() );
    }

    @Bean
    public Scanner lecteur(){
        return new Scanner(System.in);
    }

}
