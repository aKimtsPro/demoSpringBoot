package bstrom.akim.demoSpringBoot.demo.viaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

//@Configuration
public class AppConfig {

    @Bean(name = {"calc"})
    public Calculatrice calculatrice(){
        System.out.println("Creation du Bean Calculatrice");
        return new CalculatriceMock();
    }

    @Bean(name = {"interface"})
    public InterfaceConsole interfaceConsole(){
        return new InterfaceConsoleImpl( calculatrice() );
    }

    @Bean
    public Scanner scanner(){
        return new Scanner(System.in);
    }

}
