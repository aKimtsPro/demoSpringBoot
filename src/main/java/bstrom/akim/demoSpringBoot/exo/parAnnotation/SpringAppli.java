package bstrom.akim.demoSpringBoot.exo.parAnnotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAppli {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringAppli.class, args);
    }
}
