package bstrom.akim.demoSpringBoot.exo.parAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Scanner;

@Configuration
@Profile("config2")
public class AppConfigDev {

    @Bean
    public Scanner lecteur(){
        System.out.println("en profile config2");
        return new Scanner(System.in);
    }

}
