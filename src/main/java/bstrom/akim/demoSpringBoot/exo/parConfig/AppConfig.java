package bstrom.akim.demoSpringBoot.exo.parConfig;

import bstrom.akim.demoSpringBoot.exo.parConfig.services.GestionPersonne;
import bstrom.akim.demoSpringBoot.exo.parConfig.services.GestionPersonneAlex;
import bstrom.akim.demoSpringBoot.exo.parConfig.presentation.InterfaceConsoleExo;
import bstrom.akim.demoSpringBoot.exo.parConfig.presentation.InterfaceConsoleImpl;
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
