package bstrom.akim.demoSpringBoot.exo.parAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Scanner;

@Configuration
public class AppConfig {

    @Bean
    public Scanner lecteur(){
        System.out.println("en profile config1");
        return new Scanner(System.in);
    }
}
