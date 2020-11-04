package bstrom.akim.demoSpringBoot.viaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = {"calc"})
    public Calculatrice calculatrice(){
        return new CalculatriceMock();
    }

    @Bean(name = {"interface"})
    public InterfaceConsole interfaceConsole(){
        return new InterfaceConsoleImpl( calculatrice() );
    }

}
